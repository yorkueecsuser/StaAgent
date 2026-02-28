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
        int result = math.add(2, 3); // BUG: NoCanIgnoreReturnValueOnClasses

        // Unreachable switch statement
        switch (false) {
            case 1:
                System.out.println("Reachable branch");
                break;
            default:
                System.out.println("Unreachable branch");
                break;
        }
    }
}