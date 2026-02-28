import sun.misc.Unsafe;
import java.lang.reflect.Field;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafeInstance = (Unsafe) f.get(null);
        // Mutation: Duplicating the line below
        Unsafe unsafeInstanceDuplicate = (Unsafe) f.get(null);
        return unsafeInstance;
    }

    public void showBug() {
        try {
            getUnsafeInstance().allocateMemory(1024);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}