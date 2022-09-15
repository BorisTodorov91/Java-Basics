package Exam;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат по два реда до въвеждане на команда "END":
        //•	Име на играч – текст
        //•	Брой вкарани голове  – цяло положително число в интервала [1 … 10000]
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
