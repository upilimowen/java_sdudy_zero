package ru.MylearnCh1J1L1;
import java.util.Scanner;

public class MainLesson1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Задача 1
        System.out.println("Задача 1");
        System.out.print("Введите число для первой задачи: ");
        int num = in.nextInt();

        int result1 = 0;
        int result2 = 1;
        int i = 0;
        while (i < num) {
            i = i + 1;
            result1 = result1 + i;
            result2 = result2 * i;
        }
        System.out.println("Треугольное число " + result1);
        System.out.println("n! " + result2);

        //Задача 1.1
        int k = 1000;
        int l = 0;
        System.out.println("Задача 1.1");
        System.out.print(k + ":");
        while (k > 0) {
            l = k - 1;
            while (l > 1) {
                if (k % l == 0) {
                    break;
                }
                l = l - 1;
            }
            if (l == 1) {
                System.out.print(" " + k);
            }
            k = k - 1;
        }
        System.out.print(" 1");
        System.out.println();

        // Задача 2
        double result = 0;
        System.out.println("Задача 2");
        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();
        System.out.print("Введите знак операции(+ - / *): ");
        char op = in.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.printf("Извините, но на 0 делить нельзя.");
                    return;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.printf("Извините, но я ничего не понял.");
                return;
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}
