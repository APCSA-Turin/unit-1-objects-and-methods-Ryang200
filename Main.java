import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = in.next();
        System.out.print("Enter second string: ");
        String second = in.next();

        int len1 = first.length();
        int len2 = second.length();
        if (len1 > len2) {
            System.out.println(first + " is longer ");
        } else if (len2 > len1) {
            System.out.println(second + " is longer");
        } else {
            System.out.println(first + " and " + second + " are the same length.");
        }

        int mid1 = len1 / 2; 
        String firstHalf1 = first.substring(0, mid1);  
        String secondHalf1 = first.substring(mid1);    

        int mid2 = len2 / 2;
        String firstHalf2 = second.substring(0, mid2);  
        String secondHalf2 = second.substring(mid2);    

        System.out.println("First half:  " + firstHalf1);
        System.out.println("Second half: " + secondHalf1);

        System.out.println("First half: " + firstHalf2);
        System.out.println("Second half: " + secondHalf2);

        int foundIndex = first.indexOf(second); // use indexOf()
        if (foundIndex >= 0) {
            System.out.println(second + " is found in " + first + " at index " + foundIndex + ".");
        } else {
            System.out.println(second + " is NOT found in " + first + ".");
        }

        in.close();
    }
}