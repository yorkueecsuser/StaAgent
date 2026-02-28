class TypeQualifierBug {
    public static void showBug(Object obj) {
        String str = (String) obj; // Original bug
        boolean alwaysFalse = getCondition();
        for (int i = 0; alwaysFalse; i++) { // Unreachable for loop
            // This loop is unreachable as the condition is always false
            System.out.println("Unreachable code");
        }
        int length = str.length();
        System.out.println("Length of the string: " + length);
    }

    private static boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}