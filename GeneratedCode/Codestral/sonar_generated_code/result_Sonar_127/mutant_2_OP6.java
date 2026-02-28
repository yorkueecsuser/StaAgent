import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }

        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }
}