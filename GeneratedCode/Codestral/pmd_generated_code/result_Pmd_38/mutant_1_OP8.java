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
            Unsafe u = getUnsafeInstance(); // Mutated code: Renamed variable 'u'
            u.allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}