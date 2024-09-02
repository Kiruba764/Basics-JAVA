//positive negative equal
import java.util.Scanner;
class PositiveNegative{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int N=sc.nextInt();
        if(N>0){
            System.out.print(N+" is a positive number");
        }
        else if(N<0){
            System.out.print(N+" is a Negative number");
        }
        else if(N==0)
        {
            System.out.print(N+" is Zero");
        }
        else{
            System.out.print("Invalid Input");
        }
           
    }
}