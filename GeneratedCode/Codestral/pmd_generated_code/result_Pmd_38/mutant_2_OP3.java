import sun.misc.Unsafe;
import java.lang.reflect.Field;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    public boolean getFalseCondition() {
        return false; // Method to return a false condition
    }

    public void showBug() {
        try {
            getUnsafeInstance().allocateMemory(1024);
            if (getFalseCondition()) { // Insert unreachable if branch
                System.out.println("This line should not be executed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}