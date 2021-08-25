import java.util.Scanner;
// The module is used to import the scanner function, to scan the console for user input

public class TakeInputs {
    public static void main(String[] args) {
        System.out.println("Let's take some inputs from you first");
        Scanner input = new Scanner(System.in); 
        // A variable of type scanner is created, to scan the console for inputs.

        System.out.println("Lets take the entire next line as the input ?");
        String userInput = input.nextLine();
        // This will consider the entire next line as a string, including white spaces. 
        System.out.println("The user input in the first line is " + userInput); 
   


        int age = input.nextInt();
        //Scans the console for integer inputs. 
        System.out.println(age);

        //scanner.nextdatatye() is used to take input of the appropriate datatype, in the variable
        //Wrong type of data entered in the console will cause the compiler to throw run time errors


        input.close();
        //Not closing the scanner will result in memory leakage. 
        //Even if the garbage collection is done by the JVM, Its preferred to explicitly close the scanner
        //for better code optimization
    }
}
