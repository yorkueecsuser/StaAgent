import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);

        // Unreachable switch statement
        switch (false) {
            case 0:
                System.out.println("Hello");
                break;
            case 1:
                System.out.println("World");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}