class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf

        // insert unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            str = "unreachable code";
        } else {
            str = "unreachable code";
        }

        System.out.println(str);
    }

    // helper method to return a condition that is always false
    public static boolean getCondition() {
        return false;
    }
}