import jdk.jshell.spi.ExecutionControl;

public class Fibonachi {
    public static void main(String[] args) {
        //4.Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        int number1 = 0;
        int number2 = 1;
        int number3 = 0;
        System.out.print(number1 + " " + number2 + " ");
        for (int i = 0; i <= 100; i++) {
            number3 = number1 + number2;
            System.out.print(number2 + " ");
            number1 = number2;
            number2 = number3;


        }
    }
}
