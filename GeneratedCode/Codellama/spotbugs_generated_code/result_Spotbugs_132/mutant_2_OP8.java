import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());
    }
}

// Mutant 1: Renaming variable "myArray" to "x"
class BuggyExample {
    public static void main(String[] args) {
        String[] x = {"Hello", "World"};
        System.out.println(x.toString());
    }
}

// Mutant 2: Renaming variable "args" to "y"
class BuggyExample {
    public static void main(String[] y) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());
    }
}