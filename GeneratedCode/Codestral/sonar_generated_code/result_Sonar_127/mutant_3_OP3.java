import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Mutant: Unreachable if statement
        if (getFalseCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable block of code.");
        }

        return stringList.contains(integer);
    }
}