public class Coins {
    public static void main(String[] args) {

        // Parsing the command line argument as an integer
        int centsSum = Integer.parseInt(args[0]);

        // Number of quarters and remaining cents calculation
        int quarters = centsSum / 25;
        int centsRemain = centsSum % 25;

        // Display result
        System.out.println("Use " + quarters + " quarters and " + centsRemain + " cents");
    }
}
