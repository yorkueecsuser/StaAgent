import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return stringCollection.contains(str);
        }

        // Unreachable switch statement mutation
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("This line should not be executed.");
                break;
        }

        return false;
    }

    private boolean getCondition() {
        // Dummy method to avoid compile-time constant in the if statement
        return true;
    }
}