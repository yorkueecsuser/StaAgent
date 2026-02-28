import java.util.Collection;
import java.util.ArrayList;

class ImpossibleDowncastBug {
    // BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> c) {
        // Unreachable switch statement mutation
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
        }

        return (String[]) c.toArray();
    }

    // Method to dynamically determine the value of the switch statement
    private int getValue() {
        return 0;  // Always returns 0, making the switch statement unreachable
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