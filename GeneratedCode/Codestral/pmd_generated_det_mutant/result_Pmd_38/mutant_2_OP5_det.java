import sun.misc.Unsafe; // BUG: DontImportSun
import java.lang.reflect.Field;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    public void showBug() {
        int rqnkklfy = 0;switch  (rqnkklfy) {case 1:float rzuyccgq = 735851013;break;default:boolean fwxeavaw = true;break;}
        try {
            getUnsafeInstance().allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}