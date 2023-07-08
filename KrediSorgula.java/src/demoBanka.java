import java.util.Scanner;
public class demoBanka {

    public static void baslikYazdir() {
        System.out.print("*************************************" + "\n");
        System.out.print("*****KREDİ GİRİŞ VE SORGULAMA PROGRAMI*****" + "\n");
        System.out.print("**************************************" + "\n");
    }

    public static void menuYazdir() {
        System.out.print("MENÜ : " + "\n");
        System.out.print("(1) Kredi Gir : " + "\n");
        System.out.print("(2) Kredi Sorgula : " + "\n");
        System.out.print("(1) Programı Sonlandır : " + "\n");

    }

    public static void menuKrediSec() {
        System.out.print("--------------------" + "\n");
        System.out.print("Kredi giriş : " + "\n");
        System.out.print("(1) ABanka : " + "\n");
        System.out.print("(2) BBanka : " + "\n");
    }

    public static void main(String[] args) {

        ABanka aBank = new ABanka();
        BBanka bBank = new BBanka();

        Scanner key = new Scanner(System.in);


        int secim = 0;
        int stok;
        boolean karar = true;

        baslikYazdir();

        while (karar) {

            menuYazdir();
            System.out.print("İşlem seçiniz:");
            secim = key.nextInt();

            switch (secim) {
                case 1:
                    menuKrediSec();
                    System.out.println("Kredi seçiniz:");
                    secim = key.nextInt();


                    if (secim == 1) {
                        aBank.krediGir(aBank);
                    } else {
                        bBank.krediGir(bBank);
                    }

                    break;
                case 2:
                    menuKrediSec();
                    System.out.println("Kredi seçiniz:");
                    secim = key.nextInt();

                    if (secim == 1) {

                        aBank.krediSorgula(aBank);
                    } else {

                        bBank.krediSorgula(bBank);
                    }

                    break;


                default:
                    System.out.println("Program sonlandırıldı!");
                    System.exit(0);

            }
        }
    }
}
