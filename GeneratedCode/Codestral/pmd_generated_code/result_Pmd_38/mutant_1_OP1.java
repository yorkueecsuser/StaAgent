import sun.misc.Unsafe;
import java.lang.reflect.Field;
import java.util.Random;

class SunBug {
    public static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return (Unsafe) f.get(null);
    }

    public void showBug() {
        try {
            char deadStore = getRandomChar();
            getUnsafeInstance().allocateMemory(1024);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static char getRandomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'a');
    }
}