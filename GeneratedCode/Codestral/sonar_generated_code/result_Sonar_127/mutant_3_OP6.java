import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Inserted unreachable for loop
        for(int i = 0; getCondition(); i++) {
            System.out.println("This code will never be executed.");
        }

        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }
}