package Exam;

import java.util.Scanner;

public class P02CatWalking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int walking = Integer.parseInt(scanner.nextLine());
        int numOfWalking = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalWalkMin = walking * numOfWalking;
        int burnCaloresForDay = totalWalkMin * 5;

        double procent = calories * 0.5;

        if (burnCaloresForDay >= procent) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnCaloresForDay);
        } else {
            System.out.printf( "No, the walk for your cat is not enough. Burned calories per day: %d.", burnCaloresForDay);
        }

    }
}
