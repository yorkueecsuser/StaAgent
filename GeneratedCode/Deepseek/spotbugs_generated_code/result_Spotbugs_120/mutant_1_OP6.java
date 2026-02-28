class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    // BUG: BC: Impossible cast (BC_IMPOSSIBLE_CAST)
    public static Integer showBug(Object obj) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable for loop added as per the mutation operator
            System.out.println("This line should never be executed.");
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }
}