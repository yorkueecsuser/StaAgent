import java.lang.reflect.InvocationTargetException;

class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Mutation: Unreachable for loop
        boolean falseCondition = false;
        for(int i = 0; falseCondition; i++) {
            // Unreachable code
            System.out.println("This code should never execute.");
        }
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        createInstance(cls);
    }

    // Helper method to avoid using compile-time constants directly
    private boolean getCondition() {
        return false;
    }
}