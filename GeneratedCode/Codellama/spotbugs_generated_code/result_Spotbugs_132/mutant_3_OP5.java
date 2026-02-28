import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());

        // Unreachable switch statement
        int value = getValue();
        switch(value) {
        case 0:
            System.out.println("This statement is unreachable");
            break;
        case 1:
            System.out.println("This statement is also unreachable");
            break;
        default:
            System.out.println("This default statement is unreachable");
        }
    }

    // Method to get a value for the switch statement
    public static int getValue() {
        return 0;
    }
}