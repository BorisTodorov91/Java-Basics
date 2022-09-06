package Lab.FirstStepsInCoding;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String name = scanner.nextLine();
        int  numOfProject = Integer.parseInt(scanner.nextLine());


        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, numOfProject * 3,numOfProject);

    }
}
