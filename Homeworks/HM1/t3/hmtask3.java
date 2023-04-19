/*Реализовать простой калькулятор */

package Homeworks.HM1.t3;
import java.util.Scanner;


public class hmtask3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Найдем сумму, введите первое число: ");
        String number1 = iScanner.nextLine();
        System.out.printf("Введите второе число: ");
        String number2 = iScanner.nextLine();
        int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
        System.out.printf("Сумма равна %d", sum);
        iScanner.close();
    }
}
