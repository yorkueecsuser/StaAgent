class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop will never be executed as the condition is always false
            System.out.println("This is an unreachable loop");
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }

    public static boolean getCondition() {
        return false;
    }
}