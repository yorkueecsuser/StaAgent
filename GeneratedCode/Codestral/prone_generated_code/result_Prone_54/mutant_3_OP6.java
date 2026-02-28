class FormatStringBug {
    private static boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void showBug() {
        //... original code...

        // Mutation: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // This loop is unreachable
            System.out.println("This line should never be executed.");
        }
    }
}