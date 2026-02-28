import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println(myArray.toString());
        }
    }

    public static boolean getCondition() {
        return false;
    }
}