import java.util.Scanner;

public class SalaryCalculator {

    public static double calculateAnnualSalary(double hoursperweek, double incomeperhour, int vacationdays)
    {   
        double annualSalary = (hoursperweek * 52 - vacationdays * 8) * incomeperhour;
        return annualSalary;
    }

    public static void main(String[] args) {
        System.out.println("Lets calculate your Salary");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the no of hours you spent working in a week");
        double hoursperweek = userInput.nextDouble();
        System.out.println("Enter the amount charged per hour for your labour ");
        double chargeperhour = userInput.nextDouble();
        System.out.println("Enter the no of vacation days you have taken in the year, please be honest");
        int leaves = userInput.nextInt();
        userInput.close();
        System.out.println("Your gross annual salary will be " + calculateAnnualSalary(hoursperweek, chargeperhour, leaves));
    }
}
