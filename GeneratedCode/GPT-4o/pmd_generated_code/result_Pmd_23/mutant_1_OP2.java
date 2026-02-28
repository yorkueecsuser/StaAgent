import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {
    
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // Original assignment statement
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray
        
        // Duplicated assignment statement as per Mutation Operator: Duplication
        Integer[] aDup = (Integer[]) c.toArray(); // This is a duplicate for mutation purpose

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