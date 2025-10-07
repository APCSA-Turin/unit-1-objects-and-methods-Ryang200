public class ChatBot {

   // instance variables
   private String name;
   private int number;

   // constructor
   public ChatBot(String chatBotName, int faveNum) {
       name = chatBotName;
       number = faveNum;
   }

   // void method that prints a greeting
   public void greeting(String yourName) {
       System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
       System.out.println("and I am a chat bot! How are you today?");
   }

   // void method that prints the weather
   public void weather() {
       System.out.println("I actually don't know much about the weather! Ha ha!");
       System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
   }

   // method that converts feet to meters and returns the meters
   public double convertFeetToMeters(int numFeet) {
       final double METERS_PER_FOOT = 0.3048;
       return METERS_PER_FOOT * numFeet;
   }

   // void method that prints information about favorite numbers
   public void favoriteNumber(int yourNumber) {
       int distance = yourNumber - number;  // number is an instance variable
       System.out.println("My favorite number is " + number);
       System.out.println("That is " + distance + " away from your number!");
   }

   // method that adds and returns the sum of three numbers
   public int addNumbers(int num1, int num2, int num3) {
       return num1 + num2 + num3;
   }

   public String goodbye() {
       return "It was nice talking with you! Have a great day! Sincerely, " + name;
   }

   public void tellJoke() {
        System.out.println("Why did the computer show up at work late?");
        System.out.println("Because it had a hard drive.");
   }
    
   public void introduce(String hobby, String city) {
        System.out.println("I’m " + name + ", a chat bot who loves " + hobby + ".");
        System.out.println("I’ve always wanted to visit " + city + " someday!");
   }

   public String createNickname(String userName) {
        return userName + "inator";
   }

   public String getMoodResponse(String mood) {
        if (mood.equalsIgnoreCase("happy")) {
            return "Yay! I'm happy you're happy!";
        } else if (mood.equalsIgnoreCase("sad")) {
            return "I'm here if you need to talk!";
        } else {
            return "Interesting mood, " + mood + "! Let's chat more about it.";
        }
   }

   public int calculateAgeInMonths(int ageYears) {
        return ageYears * 12;
   }

   public double circleArea(double radius) {
        return Math.PI * radius * radius;
   }
}



