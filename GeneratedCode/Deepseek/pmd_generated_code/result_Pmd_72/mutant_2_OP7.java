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

        boolean conditionWhile = getCondition(); // New mutant code
        while (conditionWhile) { // New mutant code to insert an unreachable while loop
            // This will make the loop unreachable
        }
    }

    private static boolean getCondition() { // New method to return a non-final condition
        return false;
    }
}