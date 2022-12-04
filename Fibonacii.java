import java.util.*;
public class Fibonacii 
{
    //Fibonacci Series
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int s=0, c=0, sum=0;
        while(s<n){
            s=a+b;
            if(s>n)
                break;
            System.out.println(s);
            if(c%2==0)
                sum=sum+s;
            a=b;
            b=s;
            c++;
        }
        System.out.println("sum="+ sum);
    }
    
}
