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
        boolean unreachableCondition = getCondition(); // Dynamically determined condition
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This code is unreachable.");
        }
        
        Iterator<Integer> iterator = numbers.iterator();
        return hasNext(iterator);
    }

    // Method that incorrectly uses next() inside hasNext()
    private boolean hasNext(Iterator<Integer> iterator) {
        if (iterator.hasNext()) {
            iterator.next(); // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        return false; // Ensures the loop is unreachable at runtime
    }
}