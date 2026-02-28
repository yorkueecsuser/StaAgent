import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;

class BuggyIterator implements Iterator<String> {
    private List<String> elements = new ArrayList<>();
    private int p = 0; // Mutation: Replace 'position' with 'p'

    public BuggyIterator(List<String> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return p < elements.size(); // Update 'position' to 'p'
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException(); // Mutation: Throw NoSuchElementException
        }
        return elements.get(p++); // Update 'position' to 'p'
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }
}