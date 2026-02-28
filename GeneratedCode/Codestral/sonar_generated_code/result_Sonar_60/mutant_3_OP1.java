import java.util.Iterator;
import java.util.NoSuchElementException;

// BUG: "iterator" should not return "this"
class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {
    private final int[] elements;
    private int position = 0;
    private int deadStore; // dead store variable

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
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements[position++];
    }

    public void showBug() {
        for (Integer i : this) {
            System.out.println(i);
            deadStore = i; // using the dead store variable
        }

        // The second iteration will not work correctly because the iterator state is shared
        for (Integer i : this) {
            System.out.println(i);
        }
    }
}