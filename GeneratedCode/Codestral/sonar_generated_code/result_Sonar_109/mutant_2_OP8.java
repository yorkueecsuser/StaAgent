import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;

class BuggyIterator implements Iterator<String> {
    private List<String> elements = new ArrayList<>();
    private int p = 0; // Renamed "position" to "p"

    public BuggyIterator(List<String> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return p < elements.size(); // Updated the reference to the renamed variable
    }

    @Override
    public String next() { // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        if (!hasNext()) {
            throw new NoSuchElementException(); // Fixed the bug by throwing NoSuchElementException
        }
        return elements.get(p++); // Updated the reference to the renamed variable
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }
}