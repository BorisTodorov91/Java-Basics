package Exam;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();

        int numOfSet = Integer.parseInt(scanner.nextLine());


        double totalSum = 0;
        if (fruit.equals("Watermelon")) {
            if (size.equals("small")) {
                totalSum = (2 * 28.70) * numOfSet;
            } else if (size.equals("big")) {
                totalSum = (5 * 28.70) * numOfSet;
            }
        } else if (fruit.equals("Mango")) {
            if (size.equals("small")) {
                totalSum = (2 * 36.66) * numOfSet;
            } else if (size.equals("big")) {
                totalSum = (5 * 19.60) * numOfSet;
            }
        } else if (fruit.equals("Pineapple")) {
            if (size.equals("small")) {
                totalSum = (2 * 42.10) * numOfSet;
            } else if (size.equals("big")) {
                totalSum = (5 * 24.80) * numOfSet;
            }
        } else if (fruit.equals("Raspberry")) {
            if (size.equals("small")) {
                totalSum = (2 * 20) * numOfSet;
            } else if (size.equals("big")) {
                totalSum = (5 * 15.20) * numOfSet;
            }
        }
        double procent = 0;
        if (totalSum >= 400 && totalSum <= 1000) {
            procent = totalSum * 0.15;
            System.out.printf("%.2f lv.", totalSum - procent);
        } else if (totalSum > 1000) {
            procent = totalSum * 0.5;
            System.out.printf("%.2f lv.", totalSum - procent);
        }
        else {
            System.out.printf("%.2f lv.", totalSum - procent);
        }
    }
}
