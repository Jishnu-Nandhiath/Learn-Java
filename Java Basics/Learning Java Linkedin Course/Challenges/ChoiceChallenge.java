import java.util.Scanner;

public class ChoiceChallenge{

    public static void main(String args[]) {
        String question = "Please enter the correct choice(A/B/C), to win a Mac Book";
        String choiceOne = "A. Kent Beck";
        String choiceTwo = "B. Alan Turing";
        String choiceThree = "C. Linus Torvalds";

        String correctAnswer = "B";

        System.out.println("Who is the father of artificial intelligence? ");
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        // Write a print statement asking the question
        // Write a print statement giving the answer choices

        System.out.println(question);

        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.next();
        userInput.close();
        // Have the user input an answer
        // Retrieve the user's input

        if(userChoice.equals(correctAnswer.toUpperCase()))
        {
            System.out.println("Congratulations, You just won an Apple Mac Book!!!");
        }
        else{
            System.out.println("That is incorrect, The correct answer is B. Alan Turing");
        }
        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
