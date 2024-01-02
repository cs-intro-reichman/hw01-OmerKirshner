public class AddTwo {
    public static void main(String[] args) {
    	
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // #feedback: better to give a meaningful name
        int sum = (a + b);
        
        System.out.println(a + " + " + b  + " = " + sum );
    }
}
