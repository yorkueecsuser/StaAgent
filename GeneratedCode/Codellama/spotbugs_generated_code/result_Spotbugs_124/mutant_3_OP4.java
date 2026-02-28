class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
        // Mutation Operator: Unreachable if-else statement
        boolean isReachable = getReachability();
        if (isReachable) {
            System.out.println("This is a reachable branch");
        } else {
            System.out.println("This is an unreachable branch");
        }
    }

    // Method to determine reachability
    private static boolean getReachability() {
        // Condition to determine reachability
        // This method can return either true or false
        // to make the rest of the code reachable or unreachable, respectively
        return false;
    }
}