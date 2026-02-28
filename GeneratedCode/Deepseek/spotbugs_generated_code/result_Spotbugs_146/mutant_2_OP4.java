import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        boolean unreachableCondition = false;
        if (list.isEmpty()) {
            Object obj = list.get(0); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        }
        // Adding unreachable if-else branch based on "Unreachable if-else statement" mutation operator
        if (unreachableCondition) {
            // This branch is unreachable as the condition is always false
            System.out.println("This line is unreachable.");
        }
        return false;
    }
}