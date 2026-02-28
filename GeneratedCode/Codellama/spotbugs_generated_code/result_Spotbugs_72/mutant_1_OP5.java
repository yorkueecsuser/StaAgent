class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Add unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case false:
                System.out.println("This statement is unreachable");
                break;
            default:
                // Do nothing
                break;
        }
    }

    private static boolean getCondition() {
        // Implement logic to return a non-final variable or an equivalent method call
        return false;
    }
}