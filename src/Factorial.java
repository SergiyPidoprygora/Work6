import java.util.Scanner;

public class Factorial {
    //3.Знайти факторіал числа 7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведіть число");
        int num = scanner.nextInt();
        int fact = 1;
        int i = 1;
        do {
            fact = num * (num - 1) * (num - 2) * (num - 3) * (num - 4) * (num - 5) * (num - 6);
            System.out.println(num);
            i++;
        } while (i <= num);
        System.out.println(fact);
    }


}


