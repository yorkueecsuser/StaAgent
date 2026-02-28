import java.util.regex.*;

class RegexBug {

    public static void showBug(){
        Pattern pattern1 = Pattern.compile("a++abc");  
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); 

        // Start Unreachable for loop
        boolean unreachableForLoop = false;
        for (int i = 0; unreachableForLoop; i++) {
            System.out.println("This is an unreachable for loop");
        }
        // End Unreachable for loop
    }

    public static void main(String[] args) {
        showBug();
    }
}