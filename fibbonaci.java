import java.util.*;
class fibbonaci {
    public static void fibbonaci(int n) {
        int first = 0;
        int second = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = first + second;
            first = second;
            second = c;
            System.out.println(c);
        }
    }
    {
      
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int count = sc.nextInt();
        fibbonaci(count);

        }
    }
