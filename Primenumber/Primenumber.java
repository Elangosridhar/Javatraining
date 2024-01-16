public class Primenumber{  
 public static void main(String args[]){  
 
  if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }
        int i=0;
        int m=0;
        int f=0; 
        int number = Integer.parseInt(args[0]);//it is the number to be checked  
        m=number/2;    
  if(number==0||number==1){
   System.out.println(number+" is not prime number");    
  }else{
   for( i=2;i<=m;i++){    
    if(number%i==0){    
     System.out.println(number+" is not prime number");    
     f=1;    
     break;    
    }    
   }    
   if(f==0)  { 
      System.out.println(number+" is prime number"); }
  }//end of else
}  
}