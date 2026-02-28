import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  // Noncompliant, the second 'a' never matches
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // Noncompliant, the sub-pattern "[02468]" never matches

        boolean condition = false;  // unreachable code can't be reached
        switch (1) {
            case 1:
                System.out.println("This code would never be reached");
                break;
            default:
                System.out.println("This code would be reached");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}