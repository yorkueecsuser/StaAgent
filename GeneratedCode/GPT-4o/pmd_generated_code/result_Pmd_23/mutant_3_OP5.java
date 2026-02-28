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

        // Introducing unreachable switch statement
        int nonFinalValue = getNonFinalValue();
        switch(nonFinalValue) {
            case 9999: // This case is unreachable since getNonFinalValue() never returns 9999
                System.out.println("This switch case is unreachable.");
                break;
            default:
                System.out.println("Default case executed.");
        }
    }

    // Method to simulate dynamic condition for the switch statement
    private static int getNonFinalValue() {
        return 0; // Always returns 0 to ensure the switch statement is unreachable for case 9999
    }
}