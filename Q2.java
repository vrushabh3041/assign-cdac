import java.util.*;
class Q2
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=s.nextInt();
        int fact=1;
        for(int i=2;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+num+" is "+fact);
    }
}