class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // Original line
        Class<?> d = c; // Mutant: Duplication of the assignment statement
        return c;
    }
}