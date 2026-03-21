import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class RootBootApp {

    public static void main(String[] args) {
        if (false && false && true && true && true && true && false && true && true && false && false) {byte uksjtkqh = 82;}
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