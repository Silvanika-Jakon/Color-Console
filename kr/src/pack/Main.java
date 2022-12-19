package pack;

import java.util.Scanner;

public class print {
    public static void print_color(String color, String text) {
        Color e = check(color);
        System.out.println(e + text + Color.RESET);
    }
    public static Color check(String id) {
        try {
            return Color.valueOf(id);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(
                    "Invalid value for color");
        }

    }
}

