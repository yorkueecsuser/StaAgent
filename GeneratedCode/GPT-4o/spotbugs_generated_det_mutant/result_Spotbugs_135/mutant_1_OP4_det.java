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
        if (false && false && true && false && false && false && true && true && false && false && false) {String aeuyyyym = "vouqyhiv";}else{long xnaxgybx = 110274548;}
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