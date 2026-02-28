import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        boolean conditionWhile = false;
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Mutated code: Unreachable while loop
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }

        // Original code
        return stringList.contains(integer);
    }
}