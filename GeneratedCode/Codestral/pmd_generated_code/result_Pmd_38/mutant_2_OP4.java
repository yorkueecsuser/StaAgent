import sun.misc.Unsafe;
import java.lang.reflect.Field;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    public void showBug() {
        boolean shouldRun = false;
        if (shouldRun) {
            try {
                getUnsafeInstance().allocateMemory(1024);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Unreachable branch
            System.out.println("This code will never execute.");
        }
    }
}