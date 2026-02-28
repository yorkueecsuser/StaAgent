import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}