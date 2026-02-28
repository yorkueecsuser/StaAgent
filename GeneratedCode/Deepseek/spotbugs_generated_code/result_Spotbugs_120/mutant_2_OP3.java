class ImpossibleCastBug {
    public static void main(String[] args) {
        Object obj = "This is a string";
        showBug(obj);
    }

    public static Integer showBug(Object obj) {
        // Mutation: Unreachable if statement
        if (isUnreachable()) {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        }
        return (Integer) obj; // This will always throw a ClassCastException
    }

    // Method to provide the condition for the unreachable if statement
    private static boolean isUnreachable() {
        return false;
    }
}