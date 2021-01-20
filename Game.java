import java.util.*;
class Game {
    private static int findWinner(int option){
        Random rn = new Random();
        int computer = rn.nextInt(3)+1;
        switch(computer){
            case 1 : System.out.println("Computer Chooses stone");
                        break;
            case 2 : System.out.println("Computer Chooses paper");
                        break;
            case 3 : System.out.println("Computer Chooses scissor");
                        break;
        }
        switch(option){
            case 1 : if(computer == 3) return 1;
                    else if(computer == 2) return -1;
                    else return 0;
            case 2 : if(computer == 1) return 1;
                    else if(computer == 3) return -1;
                    else return 0;
            case 3 : if(computer == 2) return 1;
                    else if(computer == 1) return -1;
                    else return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int turn = 1;
        int player = 0;
        int computer = 0;
        while(turn < 6){
            System.out.println("Select Below");
            System.out.println("Round "+turn);
            System.out.println("1. stone");
            System.out.println("2. paper");
            System.out.println("3. scissor");
            int option = obj.nextInt();
            
            int data = findWinner(option);
            if(data == 1) {
                System.out.println("Player wins Game") ;
                player++;
            }
            else if(data == -1) {
                System.out.println("Computer wins Game");
                computer++;
            }
            else{
            	System.out.println("Game Draw");
            }
            turn++;
            System.out.println();
        }
        if(player > computer) System.out.println("Player Wins");
        else if(computer > player) System.out.println("Computer Wins");
        else System.out.println("Math Draw");
    }
}
