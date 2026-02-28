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

    private boolean alwaysFalse() {
        return false;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        // Unreachable switch statement
        if (alwaysFalse()) {
            switch (position) {
                case 1:
                    System.out.println("This code should never be executed");
                    break;
                // Add more cases as needed
            }
        }

        return elements.get(position++);
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }
}