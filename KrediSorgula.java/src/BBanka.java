import java.util.Scanner;
public class BBanka extends Banka {

    private int taksitSayiB;

    public int getTaksitSayiB() {
        return taksitSayiB;
    }

    public void setTaksitSayiB(int taksitSayiB) {
        this.taksitSayiB = taksitSayiB;
    }

    public Object krediGir(Object kredi) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Müşterinin adını soyadını  giriniz: ");
        String name = scanner.nextLine();
        setName(name);

        System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
        int miktar = scanner.nextInt();
        setMiktar(miktar);

        System.out.print("IBAN numaranızı giriniz: ");
        String IBN = scanner.nextLine();
        setIBN(IBN);

        System.out.print("Hangi bankadan işlem yapıyorsunuz: ");
        String whichBank = scanner.nextLine();
        setWhichBank(whichBank);

        System.out.print("Taksit sayısını giriniz: ");
        int taksitSayi = scanner.nextInt();
        setTaksitSayiB(taksitSayiB);

        return kredi;
    }

    public void krediSorgula(Object kredi) {
        System.out.println("--------------------------" + "\n" +
                "Ad Soyad : " + getName() + "\n" +
                "Çekilecek miktar : " + getMiktar() + "\n" +
                "IBAN no : " + getIBN() + "\n" +
                "Hangi Banka : " + getWhichBank() + "\n" +
                "Taksit Sayısı : " + getTaksitSayiB() + "\n");


    }
}
