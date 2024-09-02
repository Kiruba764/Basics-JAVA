//assessment question 1 expenses
import java.util.Scanner;
class Expenses {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Salary=sc.nextInt();
        int Bank=sc.nextInt();
        int hostel_fee=sc.nextInt();
        int food=sc.nextInt();
        int parents=sc.nextInt();
        int expenses= Bank+hostel_fee+food+parents;
        if(expenses>Salary)
        {
            System.out.println("He has to work hard");
        }
        else if(expenses==Salary)
        {
            System.out.println("He can manage the salary");
        }
        else if(expenses<Salary)
        {
            System.out.println("He can save money");
        }

    }
}