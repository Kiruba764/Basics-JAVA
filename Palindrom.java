//palindrom(do reverse and compare orginalnumber with reversed number)
import java.util.Scanner;
class Palindrom{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int rev=0;
    while(n>0)
    {
        int rem=n%10;
        rev=rem*10+rev;
        n=n/10;
    }
    if(n==rev)
    {
        System.out.println("The number"+n+"is Palimdrom");
    }
    else
       System.out.println("The number"+n+"is not palindrom");
    }

}