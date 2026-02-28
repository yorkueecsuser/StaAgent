class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);
    }
    
    // BUG: SubstringOfZero
    // The line above contains the bug, specifically the call to substring(0)
    // which returns the original string instead of a substring.

    // Unreachable switch statement mutant
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);
        switch (getCondition()) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }

    public static boolean getCondition() {
        return false;
    }
}