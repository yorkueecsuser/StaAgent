class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Mutated Code: Unreachable switch statement
        int unreachableValue = 0;
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }
        createInstance(cls);
    }
}