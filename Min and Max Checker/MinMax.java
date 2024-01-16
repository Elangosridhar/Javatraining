public class MinMax{
    public static void main(String[] args) {
     if (args.length == 0) {
            System.out.println("Please provide at least one number as a command line argument.");
            return;
        }

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (String arg : args) {
           
                double num = Double.parseDouble(arg);
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}