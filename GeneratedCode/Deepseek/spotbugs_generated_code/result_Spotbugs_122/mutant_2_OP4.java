import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> c) {
        boolean condition = getCondition();
        if (condition) {
            // unreachable block
            return new String[0];
        } else {
            return (String[]) c.toArray();
        }
    }

    private boolean getCondition() {
        return false; // the condition is always false to make the block unreachable
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