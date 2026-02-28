class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        Object instance;
        do {
            instance = cls.newInstance();
        } while (false);
        return instance;
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}