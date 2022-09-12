package Exam;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance =Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double totalDistance = distance * timeForOneMeter;
        double timePlus = (Math.floor(distance/50)) * 30;

        totalDistance = totalDistance + timePlus;

        if(record > totalDistance){
            System.out.printf("Yes! The new record is %.2f seconds.",totalDistance);
        }else {
            System.out.printf("No! He was %.2f seconds slower.",totalDistance - record);
        }

    }
}
