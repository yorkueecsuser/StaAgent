class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // Original code
        Class<?> a = c; // Mutant code: Renaming variable 'c' to 'a'
        return a; // Return mutated variable
    }
}