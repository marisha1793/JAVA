/*Вывести все простые числа от 1 до 1000 */

package Homeworks.HM1.t2;

public class hmtask2 {
    public static void main(String[] args) {
        System.out.println("1 ");
        for (int number = 2; number <= 1000; number++) {
            for (int count = 2; count <= number; count++) {
                if (number % count == 0 & count == number) {
                    System.out.printf("%d ", number);
                } if (number % count == 0 & count != number) {
                    break;
                }
            }
        }

    }
}
