import java.util.*;
public class RemovingDuplicates {
    
    static Scanner sc = new Scanner(System.in);
    static int size = sc.nextInt();
    

    public static void main(String[] args) {
        
        ArrayList<Integer> set = new ArrayList<Integer>();
        ArrayList<Integer> trash = new ArrayList<Integer>();
        
        for (int i = 0; i< size; i++)
        {
            Integer num = sc.nextInt();
            
            if (set.contains(num))
            {
                //if we encounter a duplicate, trash it
                trash.add(num);
            }
            else
            {
                set.add(num);
            }
        }
        
        //if you print the set as is, you'll get an output with
        //brackets and commas. you have to convert to a string
        //that only contains the numbers and spaces
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < set.size(); i++)
        {
            //the .append method is how you add to a string
            sb.append(set.get(i));
            sb.append("\t");
        }
            
        
        System.out.println(sb.toString());

    }

}
