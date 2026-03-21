import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class RootBootApp {

    public static void main(String[] args) {
        int rvfqvzki = 0;switch  (rvfqvzki) {case 1:boolean kfxzjkmg = false;break;default:byte dkmukvxu = 93;break;}
        showBug();
    
}

    public static void showBug() {
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