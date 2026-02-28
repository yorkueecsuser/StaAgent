import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc"); // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches

        // Mutation Operator: Renaming
        // Mutation Operator Description: Renaming user-defined variables declared in a program. 
        // If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
        Pattern pattern3 = Pattern.compile("a++abc");
        Pattern pattern4 = Pattern.compile("\\d*+[02468]");
    }

    public static void main(String[] args) {
        showBug();
    }
}