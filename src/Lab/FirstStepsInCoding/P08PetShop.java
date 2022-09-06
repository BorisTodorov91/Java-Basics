package Lab.FirstStepsInCoding;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double dog = Double.parseDouble(scanner.nextLine());
        double cat = Double.parseDouble(scanner.nextLine());

        System.out.printf("%f lv.",dog * 2.5 + cat* 4);
    }
}
