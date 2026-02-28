class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        if (false) {
            // Infinite loop to make this branch unreachable
            while(true) {
            }
        }
        return c;
    }
}