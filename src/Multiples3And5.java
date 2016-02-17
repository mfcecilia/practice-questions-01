import java.util.*;

public class Multiples3And5 {
    
    static Scanner sc = new Scanner(System.in);
    static int num = sc.nextInt();
    static int sum = 0;

    public static void main(String[] args) {
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        
        for(int i = 0; i < num; i++)
        {
            //use mod to find if it's a multiple of 3 or 5
            //putting both in the same if statement will
            //automatically consider if the number is 
            //a multiple of both 3 and 5 simultaneously
            if((i%3 == 0) || (i%5 == 0))
            {
                //build up a list of multiples of 3 and 5
                multiples.add(i);
            }
            
        }
        for(int i = 0; i < multiples.size(); i++)
        {
            //add each item in the list and store the 
            //value in the sum variable
            sum = sum + multiples.get(i);
        }
        
        System.out.println(sum);

    }

}
