package zadacha_4.Sladosty;

public class Jellybean extends Candy {
    private String vkus;

    public Jellybean(String nazvanie, double weight, double price, String vkus) {
        super(nazvanie, weight, price);
        this.vkus = vkus;
    }

    public String getVkus() {
        return vkus;
    }

    public void setVkus(String vkus) {
        this.vkus = vkus;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + " + vkus - " + vkus + " ]";
    }
}
