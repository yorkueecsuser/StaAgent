class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Reached unreachable code");
        } else {
            System.out.println("Reached reachable code");
        }
    }

    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.
}

public boolean getCondition() {
    return false;
}