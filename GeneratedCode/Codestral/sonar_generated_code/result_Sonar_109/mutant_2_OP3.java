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
    public String next() { // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        if (!hasNext()) {
            return null; // Noncompliant: should throw NoSuchElementException
        }

        // Unreachable if statement mutant
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This statement is unreachable and should be removed.");
        }

        return elements.get(position++);
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }

    // Dummy method to return false for the unreachableCondition
    private boolean getCondition() {
        return false;
    }
}