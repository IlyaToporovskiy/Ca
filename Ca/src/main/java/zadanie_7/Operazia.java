package zadanie_7;

import java.util.Scanner;

/**
 * @author ILYA Toporovskiy
 */
public class Operazia {
    String symbol;

    /**
     * @see #getUserOperazia
     */
    public void getUserOperazia() {
        Scanner inputChar = new Scanner(System.in);
        System.out.println("Введите Символ +  ,  -  , /  , *  ");

        symbol = inputChar.next();


        inputChar.close();
    }
}
