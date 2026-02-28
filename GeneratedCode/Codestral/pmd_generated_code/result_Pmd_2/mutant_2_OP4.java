class StaticField {
    static int x;

    public StaticField(int y) {
        x = y;
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            // Added unreachable branch as per the mutation operator
            System.out.println("This line will never execute");
        }
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }

    private static boolean falseCondition() {
        // This method always returns false to make the condition unreachable
        return false;
    }
}