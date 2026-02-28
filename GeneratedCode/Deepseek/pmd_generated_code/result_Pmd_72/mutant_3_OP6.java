import java.lang.reflect.Field;

class SomeEJB {
    private static int CountA;          // poor, field can be edited

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

        // Unreachable for loop mutation
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // unreachable code
            System.out.println("This code will never be executed");
        }
    }
}