import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {

    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // This would trigger the rule and throw a ClassCastException if executed
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray

        // Unreachable if statement insertion
        boolean isUnreachable = false; // Variable used to avoid compile-time constant
        if (isUnreachable) {
            System.out.println("This code branch is unreachable.");
        }

        // Return the array to demonstrate the bug
        return a;
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