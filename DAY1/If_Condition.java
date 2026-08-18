package Day1;
import java.util.*;

public class If_Condition {
    public static void main(String [] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the Age: ");
        // int a=sc.nextInt();
        // if (a>=18){
        //     System.out.println("Eligible for voting");

        // }
        // sc.close();

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Marks: ");
        // int m=sc.nextInt();
        // if (m>=35){
        //     System.out.println("Passed");
        // }else{
        //     System.out.println("Failed");
        // }
        // sc.close();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int a =sc.nextInt();
        boolean b=(a>=18)?true:false;
        if (b){
            System.out.println("Can Drive");
        }
        if (!b){
            System.out.println("cant Drive");
        }
        sc.close();
    }
}
