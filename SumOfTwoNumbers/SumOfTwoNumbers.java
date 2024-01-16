public class SumOfTwoNumbers {
    public static void main(String[] args) {
       
 // Check if the correct number of command-line arguments is provided
  
      if (args.length != 2) {
            System.out.println("Usage: Enter SumOfTwoNumbers ");
            return;
        }

        // Parse the command-line arguments as integers
       
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Print the sum
        System.out.println(  num1 + " AND " +  num2 );
       
        System.out.println("is: " + sum);
    }
}