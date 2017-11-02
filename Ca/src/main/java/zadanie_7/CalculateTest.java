package zadanie_7;

import zadanie_7.Exceptions.UnknownOperatorException;

import java.io.IOException;

/**
 * @author ILYA Toporovskiy
 */
public class CalculateTest {

    public static void main(String[] args) throws IOException, UnknownOperatorException {
        boolean dobro = true;
        final String ERRMSG = "Wrong value!";
        Operazia myOperazia = new Operazia(); // объявляем новый объект
        Calculate myCalculate = new Calculate(); // объявляем новый объект
        myCalculate.getUserInput(); // используем  метод ввод 2-х чисел
        do {
            myOperazia.getUserOperazia(); // используем  метод выбора операции//ArithmeticException
            switch (myOperazia.symbol) {

                case "+":
                    System.out.println("ВВеденный символ " + myOperazia.symbol);
                    myCalculate.sum();
                    dobro = false;
                    break;
                case "-":
                    System.out.println("ВВеденный символ " + myOperazia.symbol);
                    myCalculate.minus();
                    dobro = false;
                    break;
                case "/":
                    if (myCalculate.num2 == 0) {
                        throw new ArithmeticException("Нельзя делить на ноль - это плохо");
                    } else {
                        myCalculate.delenie();
                        dobro = false;
                        break;
                    }
                case "*":
                    System.out.println("ВВеденный символ " + myOperazia.symbol);
                    myCalculate.umnogenie();
                    dobro = false;
                    break;
                default:
                    dobro = true;
                    throw new UnknownOperatorException(ERRMSG + "\n typed " + myOperazia.symbol);
            }
        } while (dobro);


    }
}


