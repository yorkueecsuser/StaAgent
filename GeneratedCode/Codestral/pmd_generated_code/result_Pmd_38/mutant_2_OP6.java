import sun.misc.Unsafe; // BUG: DontImportSun
import java.lang.reflect.Field;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    private static boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        try {
            Unsafe unsafe = getUnsafeInstance();
            // Inserted unreachable for loop
            for (int i = 0; getUnreachableCondition(); i++) {
                // This block is unreachable
            }
            unsafe.allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}