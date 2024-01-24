import java.io.Console;
public class FibanocciConsole
{
	public static void main(String[] args) {
	   System.out.print("Enter the limit of Fibonacci number: ");  
    Console cons = System.console();
    int n = Integer.parseInt(cons.readLine());
    int first=0;
    int second=1;
    int count=1;
    do{
   System.out.print( first +" ,");
   int sum =first+second;
   first=second;
   second=sum;
   count++;
   }while(count <= n);
}
}  