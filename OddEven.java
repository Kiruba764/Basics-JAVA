//ODD OR EVEN (ex-1)
import java.util.Scanner;
class OddEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0)
          System.out.print(num +"is an even number");
        else
          System.out.print(num+"is a odd number");
    }
}