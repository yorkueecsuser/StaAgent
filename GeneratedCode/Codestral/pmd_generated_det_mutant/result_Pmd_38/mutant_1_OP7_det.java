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
        boolean ksevapdq = false;while (ksevapdq && true && false && true && true && false && true && false && true && true && true && false) {String ozhdzgpg = "rozuwvcl";}
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}