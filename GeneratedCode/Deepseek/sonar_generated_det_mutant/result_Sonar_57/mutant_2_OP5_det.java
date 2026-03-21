import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class RootBootApp {

    public static void main(String[] args) {
        int ktixfyjb = 0;switch  (ktixfyjb) {case 1:int qnqaljre = 775655876;break;default:double gxhlspzg = 123780808;break;}
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