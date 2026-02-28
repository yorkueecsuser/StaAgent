import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0); // Original bug: TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK
            Object objDuplicate = list.get(0); // Mutated code: Duplication of the assignment
            return obj.equals("bug") || objDuplicate.equals("bug"); // This line will always throw an IndexOutOfBoundsException
        }
        return false;
    }
}