import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {
    
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // Unreachable if-else statement using a runtime condition
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This code will always execute.");
        }

        // This would trigger the rule and throw a ClassCastException if executed
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray

        // Return the array to demonstrate the bug
        return a;
    }

    private boolean getUnreachableCondition() {
        // Dynamically return false, making the if-block unreachable
        return false;
    }
    
    public static void main(String[] args) {
        ClassCastExceptionDemo demo = new ClassCastExceptionDemo();
        try {
            demo.showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}