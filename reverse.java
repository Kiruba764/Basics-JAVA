//reverse a number
import jav.util.Scanner;
class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num=sc.nextInt();
        int rev=0;
        while(Num>0)
        {
            int rem=Num%10;
            rev=rev*10+rem;
            Num=Num/10;
        }
        System.out.println("The reverse number of "+Num+"is"+rev );
    }
}