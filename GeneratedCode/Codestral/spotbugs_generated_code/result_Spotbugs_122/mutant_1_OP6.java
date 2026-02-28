import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    public String[] getAsArray(Collection<String> c) {
        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is intentionally left empty to create an unreachable for loop
        }
        return (String[]) c.toArray();
    }

    private boolean getCondition() {
        // This method returns false to make the for loop condition unreachable
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