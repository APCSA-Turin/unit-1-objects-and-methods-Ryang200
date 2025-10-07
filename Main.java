import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ChatBot debbie = new ChatBot("Debbie", 7);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        debbie.greeting(userName);
        System.out.println();

        debbie.weather();
        System.out.println();


        System.out.print("Enter a number of feet to convert to meters: ");
        int feet = scanner.nextInt();
        double meters = debbie.convertFeetToMeters(feet);
        System.out.println(feet + " feet is " + meters + " meters.");
        System.out.println();

        System.out.print("Enter your favorite number: ");
        int yourNumber = scanner.nextInt();
        debbie.favoriteNumber(yourNumber);
        System.out.println();


        System.out.print("Enter three numbers separated by spaces: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum = debbie.addNumbers(num1, num2, num3);
        System.out.println("The sum of your numbers is: " + sum);
        System.out.println();

        //6 New methods
        System.out.println("Debbie will now tell a joke:");
        debbie.tellJoke();
        System.out.println();

        scanner.nextLine(); 

        System.out.print("Enter a hobby: ");
        String hobby = scanner.nextLine();
        System.out.print("Enter a city: ");
        String city = scanner.nextLine();
        debbie.introduce(hobby, city);
        System.out.println();

        System.out.print("Enter a nickname base (your name again perhaps): ");
        String nicknameBase = scanner.nextLine();
        String nickname = debbie.createNickname(nicknameBase);
        System.out.println("Debbie made you a nickname: " + nickname);
        System.out.println();

        System.out.print("How are you feeling today? ");
        String mood = scanner.nextLine();
        String moodResponse = debbie.getMoodResponse(mood);
        System.out.println("Debbie says: " + moodResponse);
        System.out.println();

        System.out.print("Enter your age in years: ");
        int ageYears = scanner.nextInt();
        int ageMonths = debbie.calculateAgeInMonths(ageYears);
        System.out.println("You are approximately " + ageMonths + " months old!");
        System.out.println();

        System.out.print("Enter the radius of a circle: ");
        double radius = scanner.nextDouble();
        double area = debbie.circleArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println();

        String goodbyeMessage = debbie.goodbye();
        System.out.println(goodbyeMessage);

        scanner.close();
    }
}
