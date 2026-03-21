import java.lang.InstantiationException;
import java.lang.IllegalAccessException;

class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        if (getUnreachableCondition()) {
            // Unreachable statement
            return new Object();
        } else {
            return cls.newInstance();
        }
    }

    private boolean getUnreachableCondition() {
        return false;  // Always false to make the condition unreachable
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}