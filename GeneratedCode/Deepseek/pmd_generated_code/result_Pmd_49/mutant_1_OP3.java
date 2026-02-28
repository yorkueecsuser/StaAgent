class InstantiationToGetClass {
    public Class showBug() {
        boolean condition = false;
        if (condition) {
            Class c = new String().getClass(); // BUG: InstantiationToGetClass
            return c;
        }
        return this.getClass();
    }
}