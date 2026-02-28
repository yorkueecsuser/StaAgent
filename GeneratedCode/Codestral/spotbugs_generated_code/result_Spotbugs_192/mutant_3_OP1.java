class ReflectionBug {
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        int qwertyui = 10; // Dead store
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}