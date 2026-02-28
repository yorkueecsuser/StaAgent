import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);

        // Unreachable if-else statement mutant
        boolean condition = false;
        if (condition) {
            // Dead code
            System.out.println("This code is unreachable");
        } else {
            // Live code
            System.out.println("This code is reachable");
        }
    }
}