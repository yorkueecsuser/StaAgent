import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);

        // Mutant 1: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Unreachable code branch executed");
        } else {
            System.out.println("Reachable code branch executed");
        }
    }

    private static boolean getCondition() {
        return Math.random() < 0.5;
    }
}