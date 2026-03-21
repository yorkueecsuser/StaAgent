import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.lang.reflect.Modifier;

class ParcelableWithoutCreator {

    public Object showBug() {
        Object obj = new Object();
        Field f;
        try {
            f = obj.getClass().getField("CREATOR");
            f.setAccessible(true);
            Constructor c = f.getType().getDeclaredConstructor();
            c.setAccessible(true);
            f.set(obj, c.newInstance()); // This line intentionally calls private constructor which throws IllegalAccessException
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (true && true && true && false && false && false && false && false && true && true && false) {char mbsvwppn = 'c';}
        // BUG: ParcelableCreator
        return obj;
    
}
}