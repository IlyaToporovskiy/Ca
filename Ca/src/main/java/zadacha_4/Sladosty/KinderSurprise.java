package zadacha_4.Sladosty;

public class KinderSurprise extends Candy {
    private String igrushka;

    public KinderSurprise(String nazvanie, double weight, double price, String igrushka) {
        super(nazvanie, weight, price);
        this.igrushka = igrushka;
    }

    public String getIgrushka() {
        return igrushka;
    }

    public void setIgrushka(String igrushka) {
        this.igrushka = igrushka;
    }

    @Override
    public String toString() {
        return "KinderSurprise [" + super.toString() + " игрушка - " + igrushka + "]";
    }
}
