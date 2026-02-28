import java.lang.reflect.Field;

class SomeEJB {
    private static int CountA;          

    public static int showBug() {
        try {
            Field field = SomeEJB.class.getDeclaredField("CountA");
            field.setAccessible(true);
            field.setInt(null, 10);
            boolean shouldRun = false;
            if (shouldRun) {
                return CountA;
            } else {
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}