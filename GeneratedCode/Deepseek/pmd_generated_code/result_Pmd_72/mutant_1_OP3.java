import java.lang.reflect.Field;

class SomeEJB {
    private static int CountA;          // poor, field can be edited

    // BUG: StaticEJBFieldShouldBeFinal

    public static int showBug() {
        try {
            Field field = SomeEJB.class.getDeclaredField("CountA");
            field.setAccessible(true);
            field.setInt(null, 10);
            return CountA;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    // Mutant
    public static int mutant() {
        boolean shouldRun = false; // Mutant: Using compile-time constant directly in an if condition
        if (shouldRun) {
            try {
                Field field = SomeEJB.class.getDeclaredField("CountA");
                field.setAccessible(true);
                field.setInt(null, 10);
                return CountA;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
        return 0; // This branch is unreachable, but mutation is still successful.
    }
}