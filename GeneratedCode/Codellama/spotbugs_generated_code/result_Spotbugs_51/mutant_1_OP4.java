class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));

        // Unreachable if-else statement mutant
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Reachable code");
        } else {
            System.out.println("Unreachable code");
        }
    }

    private boolean getCondition() {
        // This method is used to return a dynamically determined condition at runtime
        return true;
    }
}