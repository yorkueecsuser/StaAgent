class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
        }
        return cls.newInstance();
    }

    // Dummy method to simulate the condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}