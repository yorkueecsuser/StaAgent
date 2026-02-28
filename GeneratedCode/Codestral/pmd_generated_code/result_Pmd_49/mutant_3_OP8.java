class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass();
        Class<?> a = c; // Mutant: Renamed variable c to a
        return a;
    }
}