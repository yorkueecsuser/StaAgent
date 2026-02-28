class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        Class<?> r = c; // Mutant code added based on Renaming operator
        return r;
    }
}