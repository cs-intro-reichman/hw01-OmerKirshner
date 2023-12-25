public class Gen3 {
    public static void main(String[] args) {
        
        // Parsing the command line arguments as integers
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        // Generate 3 random numbers (in the given ranges)
        int number1 = (int) (Math.random() * (max - min)) + min;
        int number2 = (int) (Math.random() * (max - min)) + min;
        int number3 = (int) (Math.random() * (max - min)) + min;

        // Print generated numbers
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        int minNumber = Math.min(Math.min(number1, number2), number3);
        System.out.println("The minimal generated number was " + minNumber);
    }
}
