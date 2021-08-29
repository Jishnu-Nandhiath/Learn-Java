public class StudentProfile {
    public static void main(String[] args) {
        StudentClass Jishnu = new StudentClass("Jishnu","N",2021,9.1,"Electronics Engineering");
        StudentClass Vaishnavi = new StudentClass("Vaishnavi", "N", 2027, 9.8, "MBBS");
        Jishnu.increaseExpectedGraduationYear();
        System.out.println("Jishnu's expected year of graduation is "+Jishnu.expectedGraduationYear);
        System.out.println("Vaishnavi's expected year of graduation is "+ Vaishnavi.expectedGraduationYear);
    }
}
