import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);
        for (int i = 0; false; i++) {
            // unreachable code
            System.out.println("This is unreachable code");
        }
    }
}