class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass();
        Class<?> d = c; // Mutant: Duplicate the assignment statement
        return c;
    }
}