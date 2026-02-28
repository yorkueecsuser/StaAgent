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
        return position < elements.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        position++; // Original statement
        position++; // Mutant: Duplicated assignment statement
        return elements[position - 1];
    }

    public void showBug() {
        for (Integer i : this) {
            System.out.println(i);
        }

        // The second iteration will not work correctly because of the duplicated increment
        for (Integer i : this) {
            System.out.println(i);
        }
    }
}