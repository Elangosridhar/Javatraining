public class Concatenate {
    public static void main(String[] args) {
        // Check if the correct number of command-line arguments is provided
        if (args.length != 2) {
            System.out.println("Usage: java ConcatenateStrings <string1> <string2>");
            return;
        }

        // Concatenate the two strings
        String result = args[0] + args[1];

        // Print the result
        System.out.println( result);
    }
}