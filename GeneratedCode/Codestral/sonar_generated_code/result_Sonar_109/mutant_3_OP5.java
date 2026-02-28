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

        // MUTATION: Inserted unreachable switch statement
        boolean condition = getCondition();
        if (!condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This case is unreachable because getValue() will never return 1
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return elements.get(position++);
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    private int getValue() {
        // This method always returns a value other than 1 to make the switch case unreachable
        return 2;
    }
}