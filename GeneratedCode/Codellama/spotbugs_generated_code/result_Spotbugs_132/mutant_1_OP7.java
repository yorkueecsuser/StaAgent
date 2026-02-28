import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());

        /* Unreachable while loop */
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This statement is unreachable");
        }
    }
}