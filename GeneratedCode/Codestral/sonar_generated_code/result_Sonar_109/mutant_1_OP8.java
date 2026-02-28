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
            throw new NoSuchElementException(); // Modified: throw NoSuchElementException
        }
        int p = position; // Added: Renaming the 'position' variable to 'p'
        return elements.get(p++);
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }
}