import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        boolean unreachableBranch = getUnreachableCondition();
        if (unreachableBranch) {
            // This branch is unreachable because getUnreachableCondition() always returns false.
            Object obj = list.get(0);
            return obj.equals("bug");
        } else if (list.isEmpty()) {
            Object obj = list.get(0); // BUG: TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}