public class LinearEq {
    public static void main(String[] args) {

        // Parsing the command line arguments as double values
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // X solution
        double x = (c - b) / a;

        // Print  equation
        System.out.println(a + " * x + " + b + " = " + c);
        
        // Print  solution
        System.out.println("X = " + x);
    }
}
