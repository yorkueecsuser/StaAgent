import java.lang.reflect.Field;

class SomeEJB {
    private static int CountA;          // poor, field can be edited
    private static int CountB;          // unused variable

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
}