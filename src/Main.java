import java.util.Scanner;


public class Main {
    //1.Створити програму для виведення чисел від 1 до 10
    public static void main(String[] args) {
        int c = 1;
        while (c <= 10) {
            System.out.println(c);
            c++;
        }
        //2.Показати всі парні числа в діапазоні від 1 до 100
        for (int v = 0; v <= 100; v++) {
            if (v % 2 == 0) {
                System.out.println(v);
            }
        }
    }

}







