import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);

        // Unreachable if-else statement mutation
        boolean condition = false;
        if (condition) {
            // This branch is always false, making it unreachable
            System.out.println("This branch is always false, making it unreachable");
        } else {
            System.out.println("This branch is always true, making it reachable");
        }
    }
}