package Exam;

import java.util.Scanner;

public class P04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());

        int musala =0;
        int montbaln = 0;
        int kilimandzaro = 0;
        int k2 = 0;
        int everest = 0;

        int totalPeople = 0;

        for (int i = 1; i <=numberOfGroups ; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            if(peopleInGroup >= 1 && peopleInGroup <= 5 ){
                musala += peopleInGroup;
            }else if(peopleInGroup >= 6 && peopleInGroup <= 12){
                montbaln += peopleInGroup;
            }else if(peopleInGroup >= 13 && peopleInGroup <= 25 ){
                kilimandzaro += peopleInGroup;
            }else if(peopleInGroup >= 26 && peopleInGroup <= 40){
                k2 += peopleInGroup;
            }else if(peopleInGroup >=41){
                everest += peopleInGroup;
            }

            totalPeople += peopleInGroup;
        }

        System.out.printf("%.2f%%%n", (float)musala/totalPeople * 100);
        System.out.printf("%.2f%%%n", (float)montbaln/totalPeople * 100);
        System.out.printf("%.2f%%%n", (float)kilimandzaro/totalPeople * 100);
        System.out.printf("%.2f%%%n", (float)k2/totalPeople * 100);
        System.out.printf("%.2f%%", (float)everest/totalPeople * 100);

    }
}
