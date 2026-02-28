class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    // Mutation Operator: Unreachable if-else statement
    public static Integer showBug(Object obj) {
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            return (Integer) obj; // This will always throw a ClassCastException
        }
    }

    private static boolean falseMethod() {
        return false;
    }
}