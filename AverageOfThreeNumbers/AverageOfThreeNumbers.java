public class AverageOfThreeNumbers {
    public static void main(String[] args) {
      
  // Check if the correct number of command-line arguments is provided
        if (args.length != 3) {
            System.out.println("Usage: java AverageOfThreeNumbers <num1> <num2> <num3>");
            return;
        }

        // Parse the command-line arguments as doubles
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3;

        // Print the average
        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 );
        System.out.println(  average);
    }
}