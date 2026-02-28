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
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int value = elements[position];
        position++; // Original assignment statement
        position++; // Mutated code: Duplicated assignment statement
        return value;
    }

    public void showBug() {
        for (Integer i : this) {
            System.out.println(i);
        }

        for (Integer i : this) {
            System.out.println(i);
        }
    }
}