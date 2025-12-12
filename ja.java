import java.util.*;


public class Ja{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
         int[][] arr = new int[rows][];
         for (int i = 0; i < rows; i++)
          {
                System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
                int cols = scanner.nextInt();
                arr[i] = new int[cols];
                System.out.println("Enter the elements for row " + (i + 1) + ":");
                for (int j = 0; j < cols; j++)
                 {
                    arr[i][j] = scanner.nextInt();
                }
          }
          System.out.println("The jagged array is:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
                
            
    
    
    }
}