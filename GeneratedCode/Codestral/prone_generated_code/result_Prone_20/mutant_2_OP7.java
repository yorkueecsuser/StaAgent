import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This loop is unreachable because the condition is always false
        }

        return stringList.toArray(new Object[0]);
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}