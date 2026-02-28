import sun.misc.Unsafe; // BUG: DontImportSun
import java.lang.reflect.Field;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    public void showBug() {
        try {
            boolean conditionWhile = getCondition(); // Added method call to get a dynamic condition
            while (conditionWhile) {
                // Unreachable while loop
                // This loop will never be executed since the condition is always false
            }
            getUnsafeInstance().allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }
}