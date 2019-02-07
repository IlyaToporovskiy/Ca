
import java.util.Scanner;

/**
 * @author ILYA Toporovskiy
 * date 04.10.2017
 *
 */

public class Zadacha_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);/*ввод в консоль*/

        /*ввод первого числа */
        System.out.println("Введите первое число :");
        float a = scanner.nextFloat();

        /*ввод второго числа */
        System.out.println("Введите второе число :");
        float b = scanner.nextFloat();

        /*Сумма двух чисел*/
        float sum = a + b;
        System.out.printf("Сумма равна"+ "%1.4f", sum);

        scanner.close();

    }
}

