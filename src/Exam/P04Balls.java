package Exam;

import java.util.Map;
import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int coutRed = 0;
        int coutOrange = 0;
        int coutYellow = 0;
        int coutWhite = 0;
        int coutBlack = 0;
        int countOther= 0;

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                sum += 5;
                coutRed++;
            } else if (color.equals("orange")) {
                sum += 10;
                coutOrange++;
            } else if (color.equals("yellow")) {
                sum += 15;
                coutYellow++;
            } else if (color.equals("white")) {
                sum += 20;
                coutWhite++;
            } else if (color.equals("black")) {
                sum = sum / 2;
                coutBlack++;
            }else {
                countOther++;
            }
        }

        System.out.printf("Total points: %.0f%n Red balls: %d%n Orange balls: %d%n Yellow balls: %d%n White balls: %d%n Other colors picked: %d%n Divides from black balls: %d%n", Math.floor(sum),coutRed,
                coutOrange,coutYellow,coutWhite,countOther,coutBlack);

    }
}
