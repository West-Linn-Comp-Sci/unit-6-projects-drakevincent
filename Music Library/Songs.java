 
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;


/**
 * Method code for music library
 * 
 * 5/3
 */
public class Songs
{

     
    private String title;
    private String artist;
    private int time;
    private String String1;
    
   
    
    Random r = new Random();
 
    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String newArtist){
        artist = newArtist;
         
       
    
    }
    public int getTime(){
      return time;  
        
    }
    public void setTime(int newTime){
        time = newTime;
        
    }

    

    public String toString(){
         String1 = (title + "\t" + artist+ "\t" + time/60 + ":" + time%60 + "\t");
        return String1;
    }
    public Songs(String t, String a , int tt)
    {
     
        setTitle(title);
        setArtist(artist);
        setTime(time);
        toString();
        
    }
    
    
    
    }