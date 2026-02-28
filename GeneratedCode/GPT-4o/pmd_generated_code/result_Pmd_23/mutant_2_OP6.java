import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {

    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // This would trigger the rule and throw a ClassCastException if executed
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray

        // Unreachable for loop added as per mutation operator description
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable.");
        }

        // Return the array to demonstrate the bug
        return a;
    }

    // Method to simulate condition for the unreachable for loop
    private boolean getCondition() {
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