import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());
        
        // Mutation Operator: Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            // This branch is always unreachable
            System.out.println("This message will never be printed");
        } else {
            System.out.println("This message will always be printed");
        }
    }
}