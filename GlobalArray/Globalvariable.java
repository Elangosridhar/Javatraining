
import java.io.Console;
public class Globalvariable
{
    int[] Calculated = new int[4];
    
        
        void add(int a, int b){
            Calculated[0] = a+b;
        }
        void sub(int a, int b){
            Calculated[1] = a-b;
        }
        void mul(int a, int b){
            Calculated[2] = a*b;
        }
        void div(int a, int b){
            Calculated[3] = a/b;
        }
        // return Calculated[4];
    
	public static void main(String[] args) {
	  Console cons = System.console();
	  System.out.println("Enter the first Number: ");
	 int  a = Integer.parseInt(cons.readLine());
	 
	 System.out.println("Enter the Second Number: ");
	 int  b = Integer.parseInt(cons.readLine());
	  
	  Globalvariable m = new Globalvariable();
// 	  m.Calculated();
	  m.add(a,b);
	  m.sub(a,b);
	  m.mul(a,b);
	  m.div(a,b);
	  
	  System.out.print( "Results: " + m.Calculated[0] + " , "  + m.Calculated[1] + " ," + m.Calculated[2] + "," + m.Calculated[3]  );
	   //System.out.println( "Add: " + m.Calculated[0]  );
	   // System.out.println( "Sub: " + m.Calculated[1]  );
	   //  System.out.println("mul: " + m.Calculated[2] );
	   //   System.out.println("div: " + m.Calculated[3] );
	
	}
}
