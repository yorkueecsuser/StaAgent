import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean getFalseCondition() {
        // Create a method that always returns false
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        boolean falseCondition = getFalseCondition();
        switch (falseCondition) {
            case true:
                // This code is unreachable as falseCondition is always false
                System.out.println("This is an unreachable switch statement");
                break;
        }

        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }
}