import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        if(a % 2 == 1)
            System.out.print("Weird"); 
        else if(a % 2 == 0 && a>=2 && a<=5)
            System.out.println("Not Weird");
        else if(a%2 == 0 && a >= 6 && a <= 20)
            System.out.println("Weird");
        else if( a%2 == 0 && a > 20)
            System.out.println("Not Weird");
    }
}
