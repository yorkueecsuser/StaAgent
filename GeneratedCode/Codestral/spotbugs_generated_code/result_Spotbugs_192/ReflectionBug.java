class ReflectionBug {
    // Original method with the bug
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        return cls.newInstance();
    }

    // Mutated method using do-while loop
    public Object createInstanceWithDoWhileLoop(Class<?> cls) throws InstantiationException, IllegalAccessException {
        Object instance = null;
        do {
            instance = cls.newInstance();
        } while (false);
        return instance;
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
        createInstanceWithDoWhileLoop(cls); // Call the mutated method
    }
}