import java.util.Scanner;
/**
 * gets game ready
 *
 * @drake
 * @v1
 */
public class gamelauncher {
public Scanner[] reader;    


    public static void main(String[] args) {
        String result = "miss";
        int numofguess = 0;
        battleship launchgame = new battleship();
        int startpos = (int) (Math.random() * 5); 
        launchgame.setbattleship(startpos);

        System.out.println("Battle ship positions are: " +  startpos +" ," + startpos+1 + " ," + startpos+2);

        while(result != "kill") {

            Scanner reader = new Scanner(System.in); 
            System.out.println("Enter a number: ");
            int guess = reader.nextInt(); 

            numofguess++;
            if(guess < 0 || guess > 7) {
                System.out.println("Maximum space available is 7 units (0-6) and battleship length is 3 units");
                continue;
            }
            else {
                result = launchgame.guessloc(guess);
                System.out.println(result);
                if(result == "kill") {
                    System.out.println("We have destroyed all the parts of battle ship and it took " + numofguess +" guesses."  );
                    break;
                }
                else if(result == "hit") {
                    System.out.println("You have destroyed " + launchgame.numofhits + " parts of battleship.");
                    continue;
                }
                else {
                    System.out.println("It's a miss, try again");
                    continue;
                }
            }
        }
    }
}