import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {

    public String[] getAsArray(Collection<String> c) {
        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This block will never execute
        }

        // Original bug remains
        return (String[]) c.toArray();
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