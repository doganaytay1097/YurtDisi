
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz");

        String sartlar = """
                ...Yurtdışı Çıkış Kuralları...\s
                Herhangi bir siyasi yasağınızın bulunmaması gerekiyor\s
                500 TL harç bedelinizi yatırmanız gerekiyor\s
                Gideceğniz ülkeye vizenizin bulunması gerekiyor""";

        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";

        while (true){
            System.out.println("********************************");
            System.out.println(message);
            System.out.println("********************************");
            System.out.println(sartlar);

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç Bedeli Kontrol Ediliyor");

            Thread.sleep(3000);

            if (!yolcu.yurtDisiHarciKontrol()){
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi Yasak Kontrol Ediliyor");

            Thread.sleep(3000);

            if (!yolcu.siyasiYasakKontrol()){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor");
            Thread.sleep(3000);

            if (!yolcu.vizeDurumuKontrol()){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam. Yurtdışına çıkabilirsiniz");
            break;

        }


    }
}