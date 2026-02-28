import java.util.List;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        } else {
            int i = 0;
            do {
                Object obj = list.get(i); // Using do-while loop to simulate the original behavior
                if (obj.equals("bug")) {
                    return true;
                }
                i++; // Incrementing the index inside the loop body
            } while (i < list.size()); // Added equivalent do-while loop to replace the original if-else block
        }
        return false;
    }
}