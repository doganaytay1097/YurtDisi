import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurum;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yatırdığınız harç bedeli: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Herhangi bir siyasi yasağınız bulunuyor mu? (evet ya da hayır) ");
        String cevap = scanner.nextLine().toLowerCase();
        this.siyasiYasak = cevap.equals("evet");

        System.out.println("Vizeniz bulunuyor mu? (evet ya da hayır)");
        String cevap2 = scanner.nextLine().toLowerCase();
        this.vizeDurum = cevap2.equals("evet");
    }

    @Override
    public boolean yurtDisiHarciKontrol() {
        boolean harcOdendi = this.harc >= 500;
        System.out.println(harcOdendi ? "Yurtdışı harcı işlemi tamam" : "Lütfen yurtdışı harcınızı tam yatırınız");
        return harcOdendi;
    }

    @Override
    public boolean siyasiYasakKontrol() {
        boolean siyaset =! this.siyasiYasak;
        System.out.println(siyaset ? "Yurtdışına çıkabilirsiniz" : "Siyasi yasağınız bulunuyor");
        return siyaset;
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurum ){
            System.out.println("Vize işlemleri tamam");
            return true;

        }else {
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamktadır");
            return false;
        }
    }
}
