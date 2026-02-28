import java.lang.reflect.InvocationTargetException;

class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> inputClass) throws InstantiationException, IllegalAccessException {
        Class<?> renamedClass = inputClass;
        return renamedClass.newInstance();
    }

    public void showBug(Class<?> inputClass) throws InstantiationException, IllegalAccessException {
        createInstance(inputClass);
    }
}