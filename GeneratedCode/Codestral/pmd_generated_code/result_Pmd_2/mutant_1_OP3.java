class StaticField {
    static int x;
    private static boolean alwaysFalse() { return false; }

    public StaticField(int y) {
        x = y;
        if (alwaysFalse()) {
            System.out.println("This line is unreachable due to the mutation");
        }
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}