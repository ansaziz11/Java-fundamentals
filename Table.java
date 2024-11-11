import java.util.Scanner;
public class Table{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("enter a number");
       int x = input.nextInt();
       int y,z;
       System.out.println("table is Following");
       for(y=1; y < 11; y++)
       {
        z = x * y;
        System.out.println( x + "*" + y + "=" + z);
    }

    }
}