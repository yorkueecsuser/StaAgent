class ReflectionBug {
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Mutant code: Duplication of the assignment statement
        return cls.newInstance();
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}