public class StudentClass {
    String firstName,lastName,declareMajor;
    int expectedGraduationYear;
    double GPA;
    public StudentClass(String firstName, String lastName, int expectedGraduationYear,double GPA, String declareMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.GPA =  GPA;
        this.declareMajor = declareMajor;
    }
    public void increaseExpectedGraduationYear()
    {
        this.expectedGraduationYear++;
    }

}
