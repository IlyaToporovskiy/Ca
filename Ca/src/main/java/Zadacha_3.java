import java.util.Scanner;

/**
 * @author ILYA Toporovskiy
 * @see Scanner
 * @see Scanner
 */
public class Zadacha_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/*ввод в консоль*/

//выбор варианта исполнения программы

        System.out.println("Для начала выбирите действие"+"\n" + "Если в консоли ввести 1 - запуститься выполнение калькулятора,"+"\n"
                +"если 2 - поиск максимального слова в массиве");

        String vibor = scanner.next();
//Если выбор калькулятор
        if (vibor.equals("1")){
            System.out.println("Выбирите тип действия : +  ,  -  , /  , *  ");
            String tip = scanner.next();

            if (tip.equals("+")) {
                //сумма
                // ввод первого числа
                System.out.println("Введите первое число :");
                float a = scanner.nextFloat();

                //ввод второго числа
                System.out.println("Введите второе число :");
                float b = scanner.nextFloat();

                //Сумма двух чисел
                float sum = a + b;
                System.out.printf("Сумма равна" + "%1.4f", sum);
                System.out.println();


            } else if (tip.equals("-")) {
                //вычитание
                // ввод первого числа
                System.out.println("Введите первое число :");
                float a = scanner.nextFloat();

                //ввод второго числа
                System.out.println("Введите второе число :");
                float b = scanner.nextFloat();

                //Вычитание двух чисел
                float vichetanie = a - b;
                System.out.printf("Разность равна" + "%1.4f", vichetanie);
                System.out.println();

            } else if (tip.equals("*")) {
                //умножение
                //ввод первого числа
                System.out.println("Введите первое число :");
                float a = scanner.nextFloat();

                //ввод второго числа
                System.out.println("Введите второе число :");
                float b = scanner.nextFloat();

                //Умножение двух чисел
                float umnogenie = a * b;
                System.out.printf("Умножение равно" + "%1.4f", umnogenie);
                System.out.println();

            } else if (tip.equals("/")) {
                //Деление
                System.out.println("Введите первое число :");
                float a = scanner.nextFloat();

                //ввод второго числа
                System.out.println("Введите второе число :");
                float b = scanner.nextFloat();

                //Умножение двух чисел
                float delenie = a / b;
                System.out.printf("Деление равно" + "%1.4f", delenie);
                System.out.println();

            } else {
                System.out.println("вы ввели не правильно значение арифметического оператора");
            }
            scanner.close();//закрываем консоль
        }
        //конец работы калькулятора

//Запуск поиска длинного значения
        if (vibor.equals("2")){
            System.out.println("Введите длину массива :");
            int dlinaMassiva = scanner.nextInt();//ввод длины массива
            int min = 1;//минимальная длина массива

            String[] numbers = new String[dlinaMassiva];//создаем массив с заданой длиной

            for (int i = 0; i < numbers.length; i++) {      //делаем ввод значений в массив
                System.out.printf("Введите значение для элемента массива " + "%d" + "\n", i);
                numbers[i] = scanner.next();
            }
            for (int i = 0; i < numbers.length; i++)        //выводим значения массива на консоль
                System.out.println(numbers[i]);

            for (int i = 0; i < numbers.length; i++) {      //определяем максимальное значение символов
                if (min < numbers[i].length()) {
                    min = numbers[i].length();
                }
            }
            for (int i = 0; i < numbers.length; i++) {      //находим самое длинное слово
                if (numbers[i].length() == min) {
                    System.out.println("Самое длинное слово " + numbers[i]);
                }
            }
            System.out.println("Количество символов в нем = " + min);
            scanner.close();
        }
        else System.out.println("Вы ввели не верное значение");     //предупреждение
    }
}
