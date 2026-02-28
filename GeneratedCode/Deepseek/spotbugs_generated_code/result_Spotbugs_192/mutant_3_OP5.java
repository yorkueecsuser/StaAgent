class ReflectionBug {
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
        return cls.newInstance();
    }

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        // Mutation: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // This case is unreachable as getValue() never returns 1
                break;
        }
        createInstance(cls);
    }

    private int getValue() {
        // This method always returns a value other than 1 to ensure the switch statement remains unreachable
        return 0;
    }
}