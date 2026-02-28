class ReflectionBug {
    // Original bug is still present
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line is unreachable.");
        }
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}