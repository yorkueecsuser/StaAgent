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
            Unsafe a = getUnsafeInstance(); // Mutant: Renamed 'getUnsafeInstance()' to 'a'
            a.allocateMemory(1024);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}