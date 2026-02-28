class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        Object instance = cls.newInstance();
        // Mutated code: Duplicate the print statement after the method invocation
        System.out.println("Duplicate instance created: " + instance);
        return instance;
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}