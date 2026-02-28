import sun.misc.Unsafe; // BUG: DontImportSun
import java.lang.reflect.Field;

class SunBug {
    private static boolean getFalseCondition() {
        return false;
    }

    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        if (getFalseCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    public void showBug() {
        try {
            if (getFalseCondition()) {
                // This code is unreachable
                System.out.println("Unreachable code");
            }
            getUnsafeInstance().allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}