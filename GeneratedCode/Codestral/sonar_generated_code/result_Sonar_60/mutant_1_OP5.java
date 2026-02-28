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

        // Inserted unreachable switch statement
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This code will never be executed");
                break;
        }

        return elements[position++];
    }

    private int getUnreachableValue() {
        return -1;
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