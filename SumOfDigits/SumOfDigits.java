public class SumOfDigits {
    public static void main(String[] args) {
      
  // Check if the correct number of command-line arguments is provided
 
       if (args.length != 1) {
            System.out.println("Usage: Enter SumOfDigitsCommandLine");
            return;
        }

        // Parse the command-line argument as an integer

        int number = Integer.parseInt(args[0]);

        int sum = 0;
        while (number != 0) {
            sum += number % 10;   // Add the last digit to the sum
            number /= 10;         // Remove the last digit from the number
        }

        System.out.println("Sum of digits: " + sum);
    }
}