import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0); // BUG: TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK

            // Mutant: Unreachable while loop
            boolean conditionWhile = false;
            while (conditionWhile) {
                // This code will never execute
                System.out.println("This is an unreachable statement.");
            }

            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        }
        return false;
    }
}