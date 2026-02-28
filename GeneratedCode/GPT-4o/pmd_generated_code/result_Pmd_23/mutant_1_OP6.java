import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {
    
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // Unreachable for loop for mutation
        boolean conditionFor = getCondition(); // Non-final variable for loop condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }

        // This would trigger the rule and throw a ClassCastException if executed
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray

        // Return the array to demonstrate the bug
        return a;
    }

    // Method to ensure the loop condition is not a compile-time constant
    private boolean getCondition() {
        return false; // This makes the loop unreachable
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