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
        String element = elements.get(position++);

        // Inserted unreachable switch statement
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) {
            case 1:
                System.out.println("This line should never be reached");
                break;
        }

        return element;
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }
}