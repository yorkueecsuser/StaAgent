import sun.misc.Unsafe; // BUG: DontImportSun
import java.lang.reflect.Field;

class SunBug {
    // Method to return a false condition
    private static boolean getFalseCondition() {
        return false;
    }

    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    public void showBug() {
        try {
            Unsafe unsafeInstance = getUnsafeInstance();
            // Inserting unreachable if-else branch
            if (getFalseCondition()) {
                // Unreachable code
                unsafeInstance.freeMemory(0);
            } else {
                unsafeInstance.allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}