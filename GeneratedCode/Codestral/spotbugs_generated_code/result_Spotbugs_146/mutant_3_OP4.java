import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty() && unreachableCondition()) { // Introduce unreachable condition
            Object obj = list.get(0); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        } else { // Unreachable else block
            System.out.println("This is an unreachable block");
        }
        return false;
    }

    private boolean unreachableCondition() {
        return false; // Always return false to make the condition unreachable
    }
}