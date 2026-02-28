import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Added mutant code
        boolean condition = getCondition();
        switch(condition? 1 : 0) {
            case 1:
                // This case will never be reached, as the condition is always false
                System.out.println("This is an unreachable switch case");
                break;
        }

        // Original code
        return stringList.contains(integer);
    }
}