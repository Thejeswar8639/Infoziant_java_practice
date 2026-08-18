package Day6;
import java.util.*;
public class Array3D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        System.out.print("Enter the number of depth: ");
        int depth = sc.nextInt();
        int[][][] arr = new int[rows][cols][depth];
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "," + (k + 1) + "): ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        };
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    sum += arr[i][j][k];
                }
            }
        }
        System.out.println("Sum of 3D array elements: " + sum);
    }
}
