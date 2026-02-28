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

        // Inserting unreachable switch statement
        boolean shouldSwitch = getCondition();
        if (shouldSwitch) {
            int value = 0;  // This value will never be used in the switch statement
            switch (value) {
                case 1:
                    System.out.println("This is an unreachable statement");
                    break;
            }
        }

        return elements[position++];
    }

    private boolean getCondition() {
        return false;  // This method is used to ensure the condition is not compile-time constant
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