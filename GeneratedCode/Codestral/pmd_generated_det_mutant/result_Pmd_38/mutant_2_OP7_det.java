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
            boolean tiwgglsa = false;while (tiwgglsa && true && true && true && false && false && false && true && false && true && false && false) {float anzoitef = -786290366;}
            getUnsafeInstance().allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}