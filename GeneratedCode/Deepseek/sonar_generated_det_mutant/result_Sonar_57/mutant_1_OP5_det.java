import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class RootBootApp {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int pxbedbpt = 0;switch  (pxbedbpt) {case 1:long lmzkctdz = -122458332;break;default:boolean xrwoufvq = false;break;}
        try {
            Class<?> anonymousClass = Class.forName("", true, new ClassLoader() {});
            Constructor<?> constructor = anonymousClass.getDeclaredConstructor((Class[]) null);
            constructor.setAccessible(true);
            constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    
}
}