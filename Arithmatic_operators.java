package Day1;
import java.util.Scanner;

public class Arithmatic_operators {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("First number: ");
        int a=sc.nextInt();
        System.out.println("Second number: ");
        int b=sc.nextInt();

        System.out.println("Enter the opeator: ");
        char op=sc.next().charAt(0);

        if (op=='+'){
            System.out.println(a+b);
        }
        else if (op=='-'){
            System.out.println(a-b);
        }
        else if (op=='*'){
            System.out.println(a*b);
        }
        else if (op=='/'){
            System.out.println(a/b);
        }
        else if (op=='%'){
            System.out.println(a%b);
        }
        



    }
}
