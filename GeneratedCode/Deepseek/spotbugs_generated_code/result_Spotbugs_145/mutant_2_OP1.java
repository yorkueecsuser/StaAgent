import java.util.Random;

class TypeQualifierBug {
    public static void showBug(Object obj) {
        // Dead store mutation
        int deadStoreVar = new Random().nextInt();

        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }
}