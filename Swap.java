import java.util.Scanner;
public class Swap{
    public static void main(String args[]) {
        int temp;
        int a, b;
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println(""+a+" "+b);

    }
}
