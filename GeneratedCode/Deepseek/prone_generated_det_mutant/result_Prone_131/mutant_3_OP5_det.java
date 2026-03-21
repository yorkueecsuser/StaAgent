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
        int swakgjjo = 0;switch  (swakgjjo) {case 1:boolean cruybihb = true;break;default:float awvnjcrd = -897616999;break;}
        // BUG: ParcelableCreator
        return obj;
    
}
}