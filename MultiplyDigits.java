//assessment question 1 expenses
import java.util.Scanner;
class {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Salary=sc.nextInt();
        int Bank=sc.nextInt();
        int hostel_fee=sc.nextInt();
        int food=sc.nexInt();
        int parents=sc.nextInt();
        int Expenses= Bank+hostel_fee+food+parents;
        if(Expenses>Salary)
        {
            System.out.println("He has to work hard");
        }
        if else(Expenses==Salary)
        {
            System.out.println("He can manage the salary");
        }
        else if(Expenses<Salary)
        {
            System.out.println("He can save money");
        }

    }
}