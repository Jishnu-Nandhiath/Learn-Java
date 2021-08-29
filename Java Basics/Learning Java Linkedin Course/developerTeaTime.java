import java.util.Scanner;

public class developerTeaTime {
    
    public static void announceDeveloperTeaTime()
    {
        System.out.println("System is waiting to take rest, as the developer goes in a tea time break");
        Scanner input = new Scanner(System.in);
        System.out.println("Shall we Proceed boss?");
        input.next();
//Does not need to assign to a variable, because we're just checking whether the user entered anything in the console. 
        System.out.println("Yaay its the developer tea time, I'm going to hibernate boss!!!");
        input.close();
    }
    public static void main(String[] args) {
        System.out.println("This is just used here to appreciate the magic of the breakpoints");
        announceDeveloperTeaTime();
        System.out.println("Lets print everything line by line ");
    }
}
