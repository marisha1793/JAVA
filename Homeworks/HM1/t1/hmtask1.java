/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
n! (произведение чисел от 1 до n) */

package Homeworks.HM1.t1;

public class hmtask1 {
    public static void main(String[] args) {
        int number = 5;
        int sum = 0;
        int mult = 1;
        int count = 1;
        while (count <= number) {
            sum += count;
            mult *= count;
            count++;
        } 
        System.out.printf("Сумма чисел от 1 до n равна %d, факториал равен %d", sum, mult);
    }
}
