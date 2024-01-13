public class Fibonacci{
 public static void main(String [] args){
    int limit= 18;
    int first=0;
    int second=1;
    int count=1;
    do{
   System.out.print( first +" ,");
   int sum =first+second;
   first=second;
   second=sum;
   count++;
   }while(count <= limit);
}
}