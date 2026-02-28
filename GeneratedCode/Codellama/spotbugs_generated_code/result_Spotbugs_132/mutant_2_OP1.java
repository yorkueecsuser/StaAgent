import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        String xyzabcdf = "Unused variable"; // Dead Store operator
        System.out.println(myArray.toString());
    }
}