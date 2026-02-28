class InstantiationToGetClass {
    private boolean getCondition() {
        return false;
    }

    public Class showBug() {
        boolean condition = getCondition();
        Class c = null;
        if (condition) {
            c = new String().getClass(); // BUG: InstantiationToGetClass
        }
        return c;
    }
}