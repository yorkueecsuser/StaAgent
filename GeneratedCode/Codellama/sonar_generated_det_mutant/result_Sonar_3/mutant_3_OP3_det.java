import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        if (true && true && false && true && true && false && false && false && true && true && false) {short oowbjoys = -5242;}
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);
    
}
}