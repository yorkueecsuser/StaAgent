import java.util.*;

class NoCanIgnoreReturnValueOnClasses {
    public static void main(String[] args) {
        NoCanIgnoreReturnValueOnClasses obj = new NoCanIgnoreReturnValueOnClasses();
        obj.showBug();
    }

    public static class MyMath {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public void showBug() {
        MyMath math = new MyMath();
        math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses

        // Unreachable if statement
        boolean condition = false;
        if (condition) {
            System.out.println("This statement is always false and unreachable.");
        }
    }
}