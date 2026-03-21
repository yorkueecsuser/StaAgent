class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    }
}