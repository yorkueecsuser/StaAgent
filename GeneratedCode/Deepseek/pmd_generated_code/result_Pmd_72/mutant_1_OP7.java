import java.lang.reflect.Field;

class SomeEJB {
    private static int CountA;          // poor, field can be edited

    // BUG: StaticEJBFieldShouldBeFinal

    public static int showBug() {
        try {
            Field field = SomeEJB.class.getDeclaredField("CountA");
            field.setAccessible(true);
            field.setInt(null, 10);
            while (false) { // added mutant
                // unreachable code
            }
            return CountA;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}