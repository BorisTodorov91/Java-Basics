package Lab.FirstStepsInCoding;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double lent = Double.parseDouble(scanner.nextLine());

        // "The final price is: {крайна цена на услугата} lv."
        // "The discount is: {отстъпка} lv."

        double finalPrice = lent * 7.61;
        double discount = finalPrice * 0.18;
        System.out.printf("The final price is: %f lv.%n", finalPrice-discount);
        System.out.printf("The discount is: %f lv.", discount);




    }
}
