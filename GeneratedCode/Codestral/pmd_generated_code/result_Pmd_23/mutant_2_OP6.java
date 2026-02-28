import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        boolean condition = getCondition(); // Using a non-final variable or an equivalent method call
        for (int i = 0; condition; i++) { // Unreachable for loop with a dynamic condition
            // This loop will never be executed, as the condition is always false
        }

        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    }

    private boolean getCondition() {
        return false; // The condition for the unreachable for loop is always false
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}