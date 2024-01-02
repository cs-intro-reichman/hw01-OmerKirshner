public class LinearEq {
    public static void main(String[] args) {

        // Parsing the command line arguments as double values
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // X solution
        // #feedback: in jave it required to wrap calculation of double variable so it remain double
        double x = ((c - b) / a);

        // Print  equation
        System.out.println(a + " * x + " + b + " = " + c);
        
        // Print  solution
        System.out.println("X = " + x);
    }
}
