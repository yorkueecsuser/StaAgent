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
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
        }

        return position < elements.size();
    }

    private boolean getCondition() {
        // This method returns false to make the while loop unreachable
        return false;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements.get(position++);
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }
}