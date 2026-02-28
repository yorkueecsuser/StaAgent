import java.util.Iterator;
import java.util.NoSuchElementException;

class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {
    private final int[] elements;
    private int position = 0;

    public BuggyIterable(int[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return position < elements.length;
    }

    @Override
    public Integer next() {
        // Added unreachable for loop
        boolean conditionFor = alwaysFalse();
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements[position++];
    }

    // Method that always returns false
    private boolean alwaysFalse() {
        return false;
    }

    public void showBug() {
        for (Integer i : this) {
            System.out.println(i);
        }

        // The second iteration will not work correctly because the iterator state is shared
        for (Integer i : this) {
            System.out.println(i);
        }
    }
}