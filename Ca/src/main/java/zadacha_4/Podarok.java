package zadacha_4;

import zadacha_4.Sladosty.Candy;
import zadacha_4.Sladosty.ChupaChups;
import zadacha_4.Sladosty.Jellybean;
import zadacha_4.Sladosty.KinderSurprise;

public class Podarok {

     double sumWeight = 0;
     double sumPrice= 0;

    public static void main(String[] args) {

        Jellybean mentos = new Jellybean("Mentos Pure Fresh Mint", 2.50, 3.69, "мятный бальзам");
        KinderSurprise bigEgg = new KinderSurprise("Большой киндер", 3.15, 7.69, "собачка");
        ChupaChups xxl = new ChupaChups("XXL", 1.35, 1.2, "малиновая");
        Candy[] box = {mentos, bigEgg, xxl};
        for (Candy someCandy : box) {
            System.out.println(someCandy.toString());

        }
        double sumWeight ;
        double sumPrice;

        sumWeight = mentos.weight+ bigEgg.weight+xxl.weight;
        sumPrice = mentos.price+ bigEgg.price+xxl.price;
        System.out.println("Общий суммарный вес подарков  "+sumWeight + " грамм");
        System.out.println("Общая цена "+sumPrice + " руб.");


    }
}
