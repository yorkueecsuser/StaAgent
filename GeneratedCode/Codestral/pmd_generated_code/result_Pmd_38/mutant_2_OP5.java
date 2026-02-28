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
            getUnsafeInstance().allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.

            // Unreachable switch statement
            int value = getFalseValue();
            switch (value) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to return a false value
    private int getFalseValue() {
        return -1; // Always return a value that is not 1
    }
}