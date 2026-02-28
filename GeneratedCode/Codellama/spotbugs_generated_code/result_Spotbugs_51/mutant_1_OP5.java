class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("Reachable branch");
                break;
            case false:
                System.out.println("Unreachable branch");
                break;
            default:
                System.out.println("Default branch");
                break;
        }
    }

    private static boolean getCondition() {
        // Return a random boolean value
        return Math.random() > 0.5;
    }
}