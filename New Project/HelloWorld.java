import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SubStringFinder {

     public static void main(String []args) {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        //  prompt for the String
        System.out.println("Enter a String which has min-length:2 and max-length:6 ");

        // get their input as a String
        String mainString = scanner.next();
        String subString;
        int i, c, length;
        length = mainString.length();
        Set set = new HashSet();
        System.out.println("Substrings of \"" + mainString + "\" are :");
        for(c = 0 ; c < length ; c++) {
            for(i = 1 ; i <= length - c ; i++) {
                subString = mainString.substring(c, c+i);
                set.add(subString);
            }
        }
        TreeSet sortedset = new TreeSet();
        sortedset.addAll(set);

        list.addAll(sortedset);
        System.out.println(list);
    }
}
