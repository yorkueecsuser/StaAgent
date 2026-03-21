import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        String str = "Hello World!";
        boolean xmhtlgjb = false;
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);
    
}
}