package Exam;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String player = scanner.nextLine();
        String winPlayer = null;
        int result = 0;
        while (!player.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals >= 10){
                result = goals;
                winPlayer = player;
                break;
            }
            if (goals > result){
                result = goals;
                winPlayer = player;
            }

            player= scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", winPlayer);
        if (result >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", result);
        }else {
            System.out.printf("He has scored %d goals.", result);
        }

    }
}
