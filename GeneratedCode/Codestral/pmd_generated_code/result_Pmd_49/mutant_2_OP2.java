class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // Original assignment statement
        return c;
    }
}