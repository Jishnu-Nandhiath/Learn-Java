package accessModifierPrivateTest;

public class MainPrivateClass{
    private int privateClassVariable;

    public MainPrivateClass(int userInput){
        privateClassVariable = userInput;
    }

    private void getClassVariables(){
        System.out.printf("The class variables are %d \n",privateClassVariable);
    }
}