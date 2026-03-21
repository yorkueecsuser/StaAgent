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
        int gdzubyyf = 0;switch  (gdzubyyf) {case 1:int pmpqvwaw = -663928823;break;default:int seqedwns = 154735677;break;}
        Iterator<Integer> iterator = numbers.iterator();
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
}