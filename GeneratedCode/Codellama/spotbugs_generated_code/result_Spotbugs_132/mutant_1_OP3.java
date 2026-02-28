import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        boolean condition = false;
        if (condition) {
            System.out.println("This is an unreachable branch");
        } else {
            System.out.println(myArray.toString());
        }
    }
}