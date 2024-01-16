public class Checkevennumbers{
   public static void main(String [] args){
    if (args.length == 0){
    System.out.println("Please enter in the command line.");
     return;  
   }

     int num = Integer.parseInt(args[0]);
     if (num %2==0){
     System.out.println(num  +"  is even number.");
     }
      else{
      System.out.println(num +"  is odd number");
      }
   }
}