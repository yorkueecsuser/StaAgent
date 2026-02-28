import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());
        boolean shouldRun = false;
        if (shouldRun) {
            System.out.println("This statement is unreachable");
        } else {
            System.out.println("This statement is reachable");
        }
    }
}