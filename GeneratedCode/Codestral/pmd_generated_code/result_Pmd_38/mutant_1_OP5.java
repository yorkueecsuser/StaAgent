import sun.misc.Unsafe; // BUG: DontImportSun
import java.lang.reflect.Field;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    private static boolean getCondition() {
        return false; // This method always returns false, making the switch statement unreachable
    }

    public void showBug() {
        try {
            int value = -1; // This value is not used in the switch statement, so it can be any integer
            if (getCondition()) { // Ensure the condition is dynamically determined at runtime
                switch (value) {
                    case 1:
                        // This code is unreachable
                        System.out.println("Unreachable code executed!");
                        break;
                }
            }
            getUnsafeInstance().allocateMemory(1024); // This is a potential memory leak as the allocated memory is not freed.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}