import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            for (int i = 0; i < 10; i++) { // Unreachable for loop
                System.out.println("This loop is unreachable");
            }
        }

        if (list.isEmpty()) {
            Object obj = list.get(0); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}