import java.io.Console;
public class Factorialnumber{
	public static void main(String[] args) {
	   System.out.print("Enter Number Here : ");  
	int i,mul=1;  
  Console cons=System.console();  
  int number=Integer.parseInt(cons.readLine());   //It is input to type in console  
  
  for(i=1;i<=number;i++){    
      mul=mul*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+mul);    

  cons.flush();
 }  
}