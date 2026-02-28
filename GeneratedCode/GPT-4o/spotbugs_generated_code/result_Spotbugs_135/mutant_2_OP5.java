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
        
        // Unreachable switch statement added
        int unreachableCondition = getUnreachableCondition();
        switch(unreachableCondition) {
            case 1:
                System.out.println("This will never be printed");
                break;
            default:
                // This block is intentionally left empty
                break;
        }

        return hasNext(iterator);
    }

    // Method that incorrectly uses next() inside hasNext()
    private boolean hasNext(Iterator<Integer> iterator) {
        if (iterator.hasNext()) {
            iterator.next(); // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
            return true;
        }
        return false;
    }
    
    // This method returns a value ensuring the switch is unreachable
    private int getUnreachableCondition() {
        return 0; // Ensures default case is always executed
    }
}