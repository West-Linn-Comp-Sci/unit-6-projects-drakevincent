import java.util.Scanner;
/**
 * Write a description of class freq here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class freq
{
    public static void main (String[] args){
        boolean cont1 = true;
        int count = 0;
        int array[] = new int[100];
        String frequency[] = new String[100];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in integers between 1 and 100 and when you are finished enter 0");
            for (int i=1; i<101; i+=10){
                frequency[i] = "";
            }
            while (cont1){
                int userinput = in.nextInt();
                if (userinput == 0){
                    cont1 = false;
                }
                if (userinput > 0 && userinput <=100){
                    array[count] = userinput;
                    count++;
                    for(int i=1; i<101; i += 10){
                        if(array[count-1] >= i && array[count-1] <= i+9){
                            frequency[i] += "*";
                        }
                    }
                }
            }
            for (int i=1; i<101; i += 10){
                    System.out.println(i + " - " + (i+9) + " | " + frequency[i]);
            }
    }
}

