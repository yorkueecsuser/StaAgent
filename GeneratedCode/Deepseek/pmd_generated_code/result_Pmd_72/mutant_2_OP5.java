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
    }

    // Mutant Code:
    public static int showMutantBug() {
        try {
            Field field = SomeEJB.class.getDeclaredField("CountA");
            field.setAccessible(true);
            field.setInt(null, 10);
            switch (0) { // Unreachable switch case
                case 1:
                    return CountA;
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}