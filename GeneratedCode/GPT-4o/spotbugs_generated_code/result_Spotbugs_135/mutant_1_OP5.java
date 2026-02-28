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

        // Added unreachable switch statement
        example.unreachableSwitch();
    }

    public boolean showBug(List<Integer> numbers) {
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

    // Method containing an unreachable switch statement
    public void unreachableSwitch() {
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                // Since value is always 3, this block will execute.
                System.out.println("This is default case");
                break;
        }
    }
    
    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 3;  // This value makes cases 1 and 2 unreachable.
    }
}