import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of rows : ");
    int noOfRows = scan.nextInt();
    System.out.println("Enter the number of columns : ");
    int noOfCols = scan.nextInt();

    int array[][] = new int[noOfRows][noOfCols];



    int noOfElements = noOfRows * noOfCols;

    System.out.println("Please enter " + noOfElements + " elements nows.");

    // read array elements row wise.
    for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfRows; j++) {
                    array[i][j] = scan.nextInt();
            }
    }

    // close the scanner
    scan.close();
    System.out.println("The Input array is :");
    for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfRows; j++) {
                    System.out.print(array[i][j] + "\t");
            }
            System.out.println();
    }
        sortRowWise(array);
    }

    static int sortRowWise(int arr[][]) {
        // One by one sort individual rows.
        System.out.println("\n \nThe sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + "\t");
                System.out.println();
        }

        return 0;
    }
}