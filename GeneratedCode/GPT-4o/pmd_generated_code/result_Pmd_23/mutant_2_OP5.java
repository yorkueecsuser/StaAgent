import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {
    
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // This would trigger the rule and throw a ClassCastException if executed
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray

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

        // Unreachable switch statement as per mutation operator
        int value = getSomeValue(); // Non-final method call to ensure runtime determination
        switch(value) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            case 2:
                System.out.println("This will also never be executed.");
                break;
            default:
                // This block will be executed if `getSomeValue()` returns any value not handled by cases
                break;
        }
    }
    
    public static int getSomeValue() {
        return 0; // Ensures the switch cases are never reached
    }
}