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
        // Original code
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String element = elements.get(position++);

        // Mutation Operator: Inserting unreachable if-else branch
        boolean isUnreachable = getCondition();
        if (isUnreachable) {
            // This block is unreachable, added based on the mutation operator
            System.out.println("This is an unreachable block");
        }

        return element;
    }

    private boolean getCondition() {
        // Implementation of this method will ensure the condition is always false
        // For the sake of this example, let's assume it returns false
        return false;
    }

    public String showBug() {
        elements.add("Element 1");
        next();
        return next();
    }
}