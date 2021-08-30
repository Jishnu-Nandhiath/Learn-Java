import java.util.Scanner;
public class JavaStdin_and_Stdout_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.printf("%d\n%d\n%d",a,b,c);
        input.close();
    }
}
