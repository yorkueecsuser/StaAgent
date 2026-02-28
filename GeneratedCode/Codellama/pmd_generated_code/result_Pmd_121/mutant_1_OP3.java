class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        boolean condition = getCondition();
        if (condition) {
            // unreachable branch
            System.out.println("Unreachable code");
        }
        System.out.println(str);
    }

    private static boolean getCondition() {
        return false;
    }
}