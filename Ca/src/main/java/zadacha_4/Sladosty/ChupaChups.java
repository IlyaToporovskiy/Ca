package zadacha_4.Sladosty;

public class ChupaChups extends Candy {
    private String gevachka;

    public ChupaChups(String nazvanie, double weight, double price, String gevachka) {
        super(nazvanie, weight, price);
        this.gevachka = gevachka;
    }

    public String getGevachka() {
        return gevachka;
    }

    public void setGevachka(String gevachka) {
        this.gevachka = gevachka;
    }

    @Override
    public String toString() {
        return "ChupaChups [ " + super.toString() + "  жевачка - " + gevachka+ "]";
    }
}
