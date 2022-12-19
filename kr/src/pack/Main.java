package pack;
import java.text.MessageFormat;
import java.util.*;

import static pack.print.print_smth;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            print_smth();
            System.out.println("Хотите еще раз: ");
            System.out.println("1 --- Да");
            System.out.println("0 --- Нет");
            i = sc.nextInt();
        }
    }
}
