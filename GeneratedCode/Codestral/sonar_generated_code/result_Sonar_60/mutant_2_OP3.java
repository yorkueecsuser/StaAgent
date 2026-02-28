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
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This if statement is unreachable since 'unreachableCondition' is always false
            System.out.println("This line will never be executed.");
        }
        return position < elements.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements[position++];
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