import jdk.jshell.spi.ExecutionControl;

public class Fibonachi {
    public static void main(String[] args) {
        //4.Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2+ " ");
            n0 = n1;
            n1 = n2;


        }
    }
}
