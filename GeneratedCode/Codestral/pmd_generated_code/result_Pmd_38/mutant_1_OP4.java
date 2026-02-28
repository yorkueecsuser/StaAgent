import sun.misc.Unsafe; // BUG: DontImportSun
import java.lang.reflect.Field;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    private static boolean getUnreachableCondition() {
        return false; // Always returns false to make the condition unreachable
    }

    public void showBug() {
        try {
            if (getUnreachableCondition()) {
                System.out.println("This line should never be executed.");
            } else {
                getUnsafeInstance().allocateMemory(1024); // Potential memory leak
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}