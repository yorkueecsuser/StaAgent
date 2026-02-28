import java.lang.reflect.Field;

class SomeEJB {
    private static int countB;          // renamed field

    public static int showBug() {
        try {
            Field field = SomeEJB.class.getDeclaredField("countB"); //renamed variable
            field.setAccessible(true);
            field.setInt(null, 10);
            return countB;  // using renamed variable
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}