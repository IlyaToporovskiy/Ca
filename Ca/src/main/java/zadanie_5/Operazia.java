package zadanie_5;

import java.util.Scanner;

/**
 * @
 */
public class Operazia {
    String symbol;

    /**
     * @see #getUserOperazia
     */
    public void getUserOperazia() {
        Scanner inputChar = new Scanner(System.in);
        System.out.println("Введите Символ +  ,  -  , /  , *  ");
        symbol  = inputChar.next();
        inputChar.close();
    }
}
