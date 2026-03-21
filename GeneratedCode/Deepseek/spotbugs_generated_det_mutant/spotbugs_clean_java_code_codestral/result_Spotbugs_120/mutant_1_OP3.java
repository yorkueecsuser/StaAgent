class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            // This is an unreachable block
            System.out.println("This line will never be executed");
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }

    public static boolean falseCondition() {
        return false; // This method always returns false
    }
}