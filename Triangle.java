public class Triangle {
    public static void main(String[] args) {

        // Parsing the command line arguments as integers (3 sides lenghts)
        int s1 = Integer.parseInt(args[0]);
        int s2 = Integer.parseInt(args[1]);
        int s3 = Integer.parseInt(args[2]);

        // Check if those 3 sides form a triangle
        boolean isTriangle = isTriangle(s1, s2, s3);

        // Display the result
        System.out.printf("%d, %d, %d: %b\n", s1, s2, s3, isTriangle);
    }

    // Checking if three sides form a triangle
    private static boolean isTriangle(int s1, int s2, int s3) {
        return (s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2);
    }
}
