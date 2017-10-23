package zadanie_5;

import java.util.Scanner;

public class Calculate {
    /**
     * @param num1,num2,resultat числа с которыыми мы будем работать и результат
     * @see #getUserInput метод ввода
     * @see #sum
     * @see #minus
     * @see #delenie
     * @see #umnogenie
     */
    double num1, num2, resultat;

    public void getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи первое число ");
        num1 = input.nextDouble();

        System.out.println("введи второе число ");
        num2 = input.nextDouble();

    }

    public void sum() {
        resultat = num1 + num2;
        System.out.println(resultat);
    }
    public void minus(){
        resultat = num1 -num2;
        System.out.println(resultat);
    }
    public void delenie(){
        resultat = num1 /num2;
        System.out.println(resultat);
    }
    public void umnogenie(){
        resultat = num1 *num2;
        System.out.println(resultat);
    }
}
