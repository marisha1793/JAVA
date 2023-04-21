/*Реализовать простой калькулятор */

package Homeworks.HM1.t3;
import java.util.Scanner;


public class hmtask3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double number1 = iScanner.nextDouble();
        System.out.printf("Введите оператор (+,-,*,/): ");
        char operator = iScanner.next().charAt(0);
        System.out.printf("Введите второе число: ");
        double number2 = iScanner.nextDouble();
        double result = 0;
        switch(operator) {
            case '+': result = number1 + number2;
                break;
            case '-': result = number1 - number2;
                break;
            case '*': result = number1 * number2;
                break;
            case '/': result = number1 / number2;
                break;
            default: System.out.printf("Введите корректный оператор");
                break;
        }
        System.out.printf("Результат равен %f", result);
        iScanner.close();
    }
}
