import java.util.*;

class StringIndexOfBug {

    public static void main(String[] args) {
        String str = "Hello World!";
        int index = str.indexOf("World", 5, 2);
        System.out.println("The index of 'World' in the string is: " + index);
    }

    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }

    public void unreachableWhileLoop() {
        boolean condition = getCondition();
        while (condition) {
            System.out.println("This code is unreachable");
        }
    }
}