import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");
        boolean result = stringList.contains(integer);

        // Mutant: Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Alternative unreachable code");
        }

        return result;
    }
}