class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        boolean shouldRun = false;
        while(shouldRun) {
            // This will never execute
            System.out.println("This is unreachable code");
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }
}