import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());
    }
}

// Dead Store mutant
class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        String unusedVariable = "randomString";
        System.out.println(myArray.toString());
    }
}