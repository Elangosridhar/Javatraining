public class Overloading
{
	public static void main(String[] args) {
	 Calculater a = new Calculater();
	 System.out.println(a.Add(5,6));
	  System.out.println(a.Add(5,6,8));
	  System.out.println(a.Add(11.00,6.00));
	 
	}
}
// Overloading = is refers to multiple methods in a class with same name but with different parameters
class Calculater{
    public int Add(int a ,int b){
        return a+b;
    }
    
    public int Add(int a,int b,int c){
        return a+b+c;
    }
    public double Add (double a,double b){
        return a+b;
    }
    
}

