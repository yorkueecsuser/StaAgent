class StaticField {
    static int x;
    static int a; // Mutant: Renaming 'x' to 'a'

    public StaticField(int y) {
        x = y;
        a = y; // Mutant: Additional assignment to 'a'
    }

    public static int showBug(int y) {
        new StaticField(y);
        return a; // Mutant: Returning the value of 'a' instead of 'x'
    }
}