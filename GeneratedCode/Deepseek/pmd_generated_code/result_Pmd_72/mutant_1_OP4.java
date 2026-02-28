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

        if (false) {
            // This code will never be executed
            System.out.println("This code is unreachable due to the false condition.");
        } else {
            System.out.println("This is the alternative code for the unreachable if statement.");
        }
    }
}