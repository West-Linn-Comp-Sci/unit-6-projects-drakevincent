import java.util.Scanner;
/**
 * game methods
 *
 * @drake
 * @v1
 */
public class battleship {
    public int[] battleship = new int[3];
    public int numofhits = 0;
    String result = "miss";
     
    public void setbattleship(int startpos) {
        int i = 0;
        for(i = 0; i < battleship.length; i++) {
            battleship[i] = startpos + i;
            System.out.println(battleship[i]);
        }
        System.out.println("initialized array is: " + java.util.Arrays.toString(battleship));
    }

    public  int[] getbattleship() {
        System.out.println("Battleship array is: " + battleship);
        return battleship;
    }

    public String guessloc(int guessnum) {
        for(int cell : battleship) {
            System.out.println("Guessed number is: " + guessnum);
            System.out.println("cell: " + cell);
            if(cell == guessnum) {
                numofhits++;                
                if(numofhits == 3) {
                    result = "kill";
                    return result;
                }
                else {
                    result = "hit";
                    return result;
                }               
            }

            else {
                result = "miss";
                return result;
            }
        }
        return "finished";
    }
}