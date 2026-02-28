class ReflectionBug {
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Inserted unreachable while loop to maintain the original bug
        while (getClass()!= null) {
            // This loop is unreachable because getClass() never returns null
            return null;
        }
        // Original bug: using reflection to create an instance of a class
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}