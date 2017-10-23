package zadacha_4.Sladosty;

public abstract class Candy {
    public String nazvanie;
    public double weight;//в граммах
    public double price;

    public Candy(String nazvanie, double weight, double price) {
        this.nazvanie = nazvanie;
        this.weight = weight;
        this.price = price;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "название = " + nazvanie + "  вес = " + weight + "  цена = " + price;
    }
}

