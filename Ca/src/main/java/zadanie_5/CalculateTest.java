package zadanie_5;

/**
 * @author ILYA Toporovskiy
 */
public class CalculateTest {

    public static void main(String[] args) {
        Operazia myOperazia = new Operazia(); // объявляем новый объект
        Calculate myCalculate = new Calculate(); // объявляем новый объект
        myCalculate.getUserInput(); // используем  метод ввод 2-х чисел
        myOperazia.getUserOperazia(); // используем  метод выбора операции

        if (myOperazia.symbol.equals("+")) {
            System.out.println("ВВеденный символ "+ myOperazia.symbol);
            myCalculate.sum();
        }else if (myOperazia.symbol.equals("-")){
            System.out.println("ВВеденный символ "+ myOperazia.symbol);
            myCalculate.minus();
        }else if (myOperazia.symbol.equals("/")){
            System.out.println("ВВеденный символ "+ myOperazia.symbol);
            myCalculate.delenie();
        }else if (myOperazia.symbol.equals("*")){
            System.out.println("ВВеденный символ "+ myOperazia.symbol);
            myCalculate.umnogenie();
        }else
            System.out.println("Вы ввели не правильный символ");
        System.out.println("Конец программы ");
    }
}
