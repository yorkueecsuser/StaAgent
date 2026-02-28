import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {

    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // This would trigger the rule and throw a ClassCastException if executed
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray

        // Unreachable while loop added for mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }
        
        // Return the array to demonstrate the bug
        return a;
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // Ensures that the while loop is unreachable
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