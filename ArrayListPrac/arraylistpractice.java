import java.util.Arrays;
import java.util.ArrayList;

/**
 * 2d array prac
 *
 * @drake
 * @v1
 */

public class arraylistpractice
{
    public static void main(String[] args) {
        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Starting List: " + nums);
        removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

        System.out.println();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n Actual: " + countLetters(words));

        System.out.println();

        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

        System.out.println();

        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " + parseIntoArrayList("West Linn"));

        System.out.println();

        System.out.println("Test FindMin for Personobjects");
        ArrayList<person> people = new ArrayList<>(Arrays.asList(new person(32, "Abe"),
                new person(14, "Betty"), new person(18, "Cris")));
        System.out.println(people);
        System.out.println("Expected: BETTY \n Actual: " + findMin(people));

        System.out.println();

        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Smallest Coin = " + myPurse.findSmallest());
        System.out.println("Total of Purse = $" + myPurse.getTotal());
    }
    public static void removeZeros(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) != 0) {
             continue;   
            }
            list.remove(i);
            i--;
        }
    }
    public static int countLetters(ArrayList<String> list) {
        int sum = 0;
        for(String str : list) {
            sum += str.length();
        }
        return sum;
    }
    public static ArrayList<String> parseIntoArrayList(String input) {
        ArrayList<String> list = new ArrayList<>();
        for(String character : input.split("")) {
         list.add(character);   
        }
        return list;
    }
    public static int findPosition(int key, ArrayList<Integer> list) {
        return list.indexOf(key);
    }
    public static String findMin(ArrayList<person> list) {
        person youngest = list.get(0);
        for(person pers : list) {
            if(pers.getAge() < youngest.getAge()) youngest = pers;
        }
        return youngest.getName();
    }
}
