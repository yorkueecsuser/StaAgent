class ImpossibleCastBug {
    private static boolean getCondition() {
        return false; // this method always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This unreachable loop is inserted for the mutation operator
            System.out.println("This line will never be printed");
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }
}