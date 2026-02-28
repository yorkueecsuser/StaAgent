class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("Strings are not equal");
            } else {
                System.out.println("This branch is unreachable");
            }
        }
    }
    private static boolean getCondition() {
        return false;
    }
}