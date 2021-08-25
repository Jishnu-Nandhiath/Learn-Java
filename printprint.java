// import java.util.Scanner;

public class printprint {

    public static void main(String[] args) {
    
    System.out.print("This will be printed in a new line, but does not end the line, The next print will comes in the same line");

// System.out.print(): This method prints the text on the console and the cursor remains at the end of the text at the console.
// The next printing takes place from just here. This method must take atleast one parameter else it will throw an error.

    System.out.println("This will print in a new line and the code will end the line");

// System.out.println(): This method prints the text on the console and the cursor remains at the start of the next line at the console. 
// The next printing takes place from the next line. This method may or may not take any parameter.

    
    System.out.printf("This will be the printed in the next line, but printf will not end the current line");

// System.out.printf(args, values) 
// Can be used for additional text formatting while printing similar to C/C++, 
// Does not end the line after printing the text


    }
}
