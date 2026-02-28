import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

class ClassCastExceptionDemo {
    
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // This would trigger the rule and throw a ClassCastException if executed
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray

        // Unreachable if statement using a dynamically determined condition
        Random random = new Random();
        boolean condition = random.nextInt(10) < 0; // This will always be false
        if (condition) {
            System.out.println("This is an unreachable branch.");
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