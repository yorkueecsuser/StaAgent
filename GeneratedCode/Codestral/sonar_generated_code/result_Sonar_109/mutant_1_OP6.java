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
            throw new NoSuchElementException();
        }

        // Unreachable for loop inserted here for the mutation operator
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute
        }

        return elements.get(position++);
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }
}