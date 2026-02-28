import java.util.List;

class TypeQualifierBug {
    private boolean getCondition() {
        return false; // This method always returns false, simulating an unreachable if statement
    }

    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        }
        else if (getCondition()) { // added unreachable if statement
            // This will never be executed because getCondition() always returns false
            System.out.println("This is an unreachable statement");
        }
        return false;
    }
}