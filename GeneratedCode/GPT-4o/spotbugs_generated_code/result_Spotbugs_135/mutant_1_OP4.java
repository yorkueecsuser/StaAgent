import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class IteratorExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        IteratorExample example = new IteratorExample();
        boolean result = example.showBug(numbers);
        System.out.println("Result from showBug: " + result);
    }

    public boolean showBug(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        
        // Inserted unreachable if-else branch
        boolean condition = getCondition(); // Non-final variable to ensure it's not a compile-time constant
        if (condition) {
            // Unreachable block
            System.out.println("This block is unreachable.");
        } else {
            // Original code remains here
            return hasNext(iterator);
        }
        
        return false; // To ensure method has a return statement after if-else
    }

    // Method that incorrectly uses next() inside hasNext()
    private boolean hasNext(Iterator<Integer> iterator) {
        if (iterator.hasNext()) {
            iterator.next(); // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
            return true;
        }
        return false;
    }
    
    // Helper method to return false
    private boolean getCondition() {
        return false;
    }
}