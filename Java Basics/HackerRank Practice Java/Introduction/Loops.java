import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 1;  i <= 10; i++)
        {
            System.out.printf("%d x %d = %d\n",x,i,x*i);
        }
        input.close();
    }
}
