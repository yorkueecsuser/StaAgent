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
        boolean condition = getCondition(); // using non-final variable to avoid unreachable statement error
        if (condition) {
            System.out.println("Unreachable code block"); // This block will never be executed
        }
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

    // Method to provide a runtime-determined condition
    private boolean getCondition() {
        return false; // ensures the if block in showBug is never executed
    }
}