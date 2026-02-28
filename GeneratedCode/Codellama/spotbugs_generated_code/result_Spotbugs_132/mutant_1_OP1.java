import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        String abcdefgh = "Test"; // Dead store mutation
        System.out.println(myArray.toString());
    }
}