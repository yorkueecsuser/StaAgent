import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    public String[] getAsArray(Collection<String> c) {
        // Mutant: Unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            // This block is unreachable as the condition is always false.
            throw new UnsupportedOperationException("This block should not be executed.");
        }
        return (String[]) c.toArray();
    }

    private boolean isUnreachable() {
        // This method always returns false to make the if statement unreachable.
        return false;
    }

    public String[] showBug() {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        return getAsArray(collection);
    }

    public static void main(String[] args) {
        ImpossibleDowncastBug bug = new ImpossibleDowncastBug();
        String[] result = bug.showBug();
        for (String str : result) {
            System.out.println(str);
        }
    }
}