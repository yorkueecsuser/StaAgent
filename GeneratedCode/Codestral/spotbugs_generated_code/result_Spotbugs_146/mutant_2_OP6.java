import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            // Added unreachable for loop
            boolean condition = false;
            for (int i = 0; condition; i++) {
                System.out.println("Unreachable loop");
            }
            Object obj = list.get(0); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        }
        return false;
    }

    // Method to return false for unreachable loop condition
    private boolean getCondition() {
        return false;
    }
}