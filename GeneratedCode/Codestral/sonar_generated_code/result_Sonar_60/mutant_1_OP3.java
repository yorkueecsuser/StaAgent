import java.util.Iterator;
import java.util.NoSuchElementException;

// BUG: "iterator" should not return "this"
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
        if (getUnreachableCondition()) {
            // Unreachable mutant code
            System.out.println("Unreachable code in hasNext()");
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

    private boolean getUnreachableCondition() {
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