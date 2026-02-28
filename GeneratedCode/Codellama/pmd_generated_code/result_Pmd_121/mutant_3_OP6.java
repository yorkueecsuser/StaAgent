class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Do nothing
        }
    }

    private static boolean getCondition() {
        return false;
    }
}