package pack;

import java.util.Scanner;

public class print {
    public static void print_smth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш текст: ");
        String str = sc.nextLine();
        System.out.println("Введите цвет текста: ");
        String text_color = sc.nextLine().toUpperCase();
        Color e = check(text_color);
        System.out.println("Результат: ");
        System.out.println(e + str + Color.RESET);
    }
    public static Color check(String id) {
        Scanner sc = new Scanner(System.in);
        try {
            return Color.valueOf(id);
        } catch (IllegalArgumentException e) {
            System.out.println("Пожалуйста, введите корректный цвет: ");
            String text_color = sc.nextLine().toUpperCase();
            return check(text_color);
        }

    }
}

