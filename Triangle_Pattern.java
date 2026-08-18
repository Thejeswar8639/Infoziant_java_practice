package Day3;
import java.util.*;
public class Triangle_Pattern {
    @SuppressWarnings("unused")
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose the type of the triangle : \n1. Right angled triangle. \n2. Inverted right angled triangle. \n3. Equilateral triangle.\n4. Inverted equilateral triangle. \n5. Isosceles triangle. \n6. Inverted isosceles triangle. \n Enter your choice: ");
        int c=sc.nextInt();
        System.out.print("Enter the height of the triangle : ");
        int n=sc.nextInt();
        switch(c){
                case 1:
                    for(int i=1;i<=n;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    break;
                    }
                case 2:
                    for (int i=n;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i=1;i<=n;i++){
                        for(int j=i;j<n;j++){
                            System.out.print(" ");
                        }
                        for(int k=1;k<=2*i-1;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for(int i=n;i>=1;i--){
                        for(int j=i;j<n;j++){
                            System.out.print(" ");
                        }
                        for(int k=1;k<=2*i-1;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for(int i=1;i<=n;i++){
                        for(int j=i;j<n;j++){
                            System.out.print(" ");
                        }
                        for(int k=1;k<=2*i-1;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for(int i=n;i>=1;i--){
                        for(int j=i;j<n;j++){
                            System.out.print(" ");
                        }
                        for(int k=1;k<=2*i-1;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                     System.out.println("Invalid choice");
        }
    }
}
