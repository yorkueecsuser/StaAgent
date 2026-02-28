class StaticField {
    static int x;
    int deadStoreVar; // Added dead store variable

    public StaticField(int y) {
        x = y;
        deadStoreVar = 0; // Assign a value to the dead store variable
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}