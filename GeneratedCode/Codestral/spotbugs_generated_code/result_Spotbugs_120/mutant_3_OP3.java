class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        if (getCondition()) { // This branch will never be executed
            System.out.println("This branch is unreachable");
        }
        return (Integer) obj; // This will still always throw a ClassCastException
    }

    private static boolean getCondition() {
        return false;
    }
}