import java.lang.InstantiationException;
import java.lang.IllegalAccessException;

class ReflectionBug {
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line is unreachable");
        } else {
            return cls.newInstance();
        }
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}