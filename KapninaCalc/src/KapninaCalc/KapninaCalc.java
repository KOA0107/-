package KapninaCalc;
import java.util.Scanner;

public class KapninaCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите выражение:");
        String input = scanner.nextLine().trim();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Ошибка: некорректный ввод");
            return;
        }

        int a, b;
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат числа");
            return;
        }

        char oper = parts[1].charAt(0);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            System.out.println("Ошибка: недопустимые значения");
            return;
        }

        int c = calculate(a, oper, b);
        System.out.println(a + " " + oper + " " + b + " = " + c);
        scanner.close();
    }
    public static int calculate(int a, char oper, int b) {
        switch (oper) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }
}