import java.util.*;
public class Anagrams {
    

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //the .next counts the entire string, not individual letters
         String a = sc.next();
         String b = sc.next();
         
         //converty it to an array and sort it 
         char[] bArray = b.toCharArray();
         Arrays.sort(bArray);
         char[] aArray = a.toCharArray();
         Arrays.sort(aArray);
         
         if (Arrays.equals(bArray, aArray))
         {
             System.out.println("true");
         }
         else
         {
             System.out.println("false");
         }

    }

}
