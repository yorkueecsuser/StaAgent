import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}