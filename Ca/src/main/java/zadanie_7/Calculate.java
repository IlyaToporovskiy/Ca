package zadanie_7;

import java.util.InputMismatchException;
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
    public double num1, num2, resultat;
    boolean dobro = true;
    boolean dobro2 = true;

    public void getUserInput() {
        while (dobro) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введи первое число ");
            try {
                num1 = input.nextDouble();
                dobro = false;
            } catch (InputMismatchException e) {
                System.err.println("Первое число неправильно " + e);
            }
        }
        while(dobro2){
            try {
                System.out.println("введи второе число ");
                Scanner input = new Scanner(System.in);
                num2 = input.nextDouble();
                dobro2 = false;
            } catch (InputMismatchException e2) {
                System.err.println("Второе число неправильно " + e2);
            }
        }
    }

    public void sum() {
        resultat = num1 + num2;
        System.out.println(resultat);
    }

    public void minus() {
        resultat = num1 - num2;
        System.out.println(resultat);
    }

    public double getNum2() {
        return num2;
    }

    public void delenie() {
            resultat = num1 / num2;
            System.out.println(resultat);

         }

    public void umnogenie() {
        resultat = num1 * num2;
        System.out.println(resultat);
    }
}
