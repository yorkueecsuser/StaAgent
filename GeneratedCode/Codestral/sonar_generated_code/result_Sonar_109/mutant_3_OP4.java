import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;

class BuggyIterator implements Iterator<String> {
    private List<String> elements = new ArrayList<>();
    private int position = 0;

    public BuggyIterator(List<String> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return position < elements.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            return null;
        }

        // Unreachable if-else statement mutant
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            throw new AssertionError("This block is unreachable!");
        } else {
            return elements.get(position++);
        }
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }

    // Auxiliary method to avoid compile-time constant
    private boolean getCondition() {
        return false;
    }
}