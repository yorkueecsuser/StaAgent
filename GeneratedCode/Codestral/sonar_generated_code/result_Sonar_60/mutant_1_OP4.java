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
        boolean unreachableCondition = getUnreachableCondition();
        if(unreachableCondition) {
            // This code is unreachable
            System.out.println("Unreachable code");
        } else {
            // This is the reachable part of the code
            return elements[position++];
        }
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the condition unreachable
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