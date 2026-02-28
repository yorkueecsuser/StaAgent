import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());

        // Unreachable if-else statement mutant
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("Unreachable code executed.");
        } else {
            System.out.println("Reachable code executed.");
        }
    }
}