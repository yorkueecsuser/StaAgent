import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());
        int value = getValue(); // added line
        switch(value) { // added unreachable switch statement
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }

    private static int getValue() {
        return 0; // always return 0 to make the switch statement unreachable
    }
}