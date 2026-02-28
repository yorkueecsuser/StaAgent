class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Unreachable if branch
        if (getUnreachableCondition()) {
            throw new IllegalAccessException("Unreachable code executed");
        }
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }

    // Method to return unreachable condition
    private boolean getUnreachableCondition() {
        // This condition is always false
        return "unreachable".equals("reachable");
    }
}