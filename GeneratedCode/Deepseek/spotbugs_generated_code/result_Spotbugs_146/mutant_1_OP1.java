import java.util.List;
import java.util.Random;

class TypeQualifierBug {
    public boolean showBug(List<?> list) {
        if (list.isEmpty()) {
            Object obj = list.get(0); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
            // Dead Store Mutation: Unused variable declaration with int type
            int unusedVar = new Random().nextInt();
            return obj.equals("bug"); // This line will always throw an IndexOutOfBoundsException because of the previous line
        }
        return false;
    }
}