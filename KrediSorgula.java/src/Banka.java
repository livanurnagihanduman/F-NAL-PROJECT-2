//Livanur Nagihan Duman

public abstract  class Banka {

    private String name;
    private int miktar;
    private String IBN;
    private String whichBank;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMiktar(){
        return miktar;
    }
    public void setMiktar(int miktar){
        this.miktar = miktar;
    }
    public String getIBN(){
        return IBN;
    }
    public void setIBN(String IBN){
        this.IBN = IBN;
    }
    public String getWhichBank(){
        return whichBank;
    }
    public void setWhichBank(String whichBank){
        this.whichBank = whichBank;
    }

    public  abstract  Object krediGir(Object kredi);
    public abstract void krediSorgula(Object kredi);
}
