import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        // Inserting an unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This line should be unreachable");
                    break;
                default:
                    break;
            }
        }

        // Original code
        return stringList.toArray(new Object[0]);
    }

    private boolean getCondition() {
        // This method should be implemented to return a value based on runtime conditions
        // For the mutant code, it always returns false to make the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}