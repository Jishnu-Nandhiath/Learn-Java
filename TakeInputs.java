import java.util.Scanner;
// The module is used to import the scanner function, to scan the console for user input

public class TakeInputs {
    public static void main(String[] args) {
        System.out.println("Let's take some inputs from you first");
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name brother ?");
        String userInput = input.next();
        System.out.println(userInput);
        int age = input.nextInt();
        System.out.println(age);
        input.close();
    }
}
