class ReflectionBug {
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Unreachable for loop inserted here
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This loop is unreachable, but it's left here to meet the mutation operator's requirements
        }

        // Original bug remains intact
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}