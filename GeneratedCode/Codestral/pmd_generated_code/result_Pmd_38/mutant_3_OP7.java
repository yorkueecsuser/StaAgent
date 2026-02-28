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
            boolean unreachableCondition = false;
            while (unreachableCondition) {  // Mutation: Unreachable while loop
                // This code will never be executed
                System.out.println("This is an unreachable while loop.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}