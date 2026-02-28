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
        if (isUnreachableCondition()) { // Unreachable if-else branch
            throw new IllegalStateException("This branch is unreachable");
        }
        return position < elements.length;
    }

    private boolean isUnreachableCondition() {
        return false; // Always false to make it unreachable
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

        for (Integer i : this) {
            System.out.println(i);
        }
    }
}