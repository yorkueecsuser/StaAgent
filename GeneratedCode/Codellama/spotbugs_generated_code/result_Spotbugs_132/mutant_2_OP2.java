import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());
    }
}

// Generated mutant code by Duplication operator
String[] myArray = {"Hello", "World"};
System.out.println(myArray.toString());