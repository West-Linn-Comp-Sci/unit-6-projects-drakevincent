import java.util.*;
import java.util.Arrays;
/**
 * music library code
 *
 * @Drake V
 * @5/3
 */
public class MusicLibrary
{   
    public static void main(String[] args){
  
     String title;
    
     String artist;
     
     int time;
     String String1;   
    
    Random r = new Random();

    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to your Music Library");
    System.out.println("How many songs will you input?");
    int number = console.nextInt();
   

   double totalsum = 0;
   int sum = 0;
   Songs Song1;
   
   
   
    for(int x = 1; x <= number; x = x + 1){
        if(x <= number){
        

      System.out.println("\nThis is song #" + x);
      System.out.println("What is this songs name?");
       String s = console.next();
       String t;
       t = console.nextLine();
       title = t;

      System.out.println("Who is the artist of this song?");
       artist = console.nextLine();
      System.out.println("How long is this song in seconds?");
       time = console.nextInt();
      
          if(time <= 0){
              
                  
          System.out.println("Invalid command!");
          System.out.println("how long is this song in seconds?");
          time = console.nextInt();
          time++;
        }
    
      sum += time;

      
     
       Song1 = new Songs(t, artist, time);
       
        String[] songs = {};
     if(x >= number){
       
            System.out.println("=======Music Library=======");
            System.out.println("Title \t Artist \t Time \t");
            System.out.println(Song1.toString());

        
            System.out.println("The total time is: " + sum/60 + ":" + sum%60+ "\n");
           
    }
                

  
}
}

}
}