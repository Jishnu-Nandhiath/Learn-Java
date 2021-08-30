import java.util.Scanner;

public class JavaStdin_and_Stdout_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        double second = input.nextDouble();
        input.nextLine(); 
        // The additional nextLine is read is used to avoid the input taken as new line.
        // This is common in java, because after the input is taken to double the cursor will remain after the input.
        // So after enter is pressed, the new line character is taken as input for the next nextline character.
        // Inorder to compensate this, an additional extra new line reader is added in between.
        String third = input.nextLine();
        System.out.printf("String: %s\n",third);
        System.out.printf("Double: %f\n",second);
        System.out.printf("Int: %d\n",first);
        input.close();
    }
}
