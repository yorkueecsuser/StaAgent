import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> c) {
        boolean unreachableCondition = getUnreachableCondition(); // Newly added unreachable condition
        if (unreachableCondition) {
            System.out.println("This line will never be executed");
        }
        return (String[]) c.toArray();
    }

    // This method will always return false to make the if statement unreachable
    private boolean getUnreachableCondition() {
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