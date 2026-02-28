import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { /* code */ }
        System.out.println(myArray.toString());
    }

    private static boolean getCondition() {
        return false;
    }
}