class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        // Unreachable switch statement mutant
        int n;
        int value = getValue();
        switch (value) {
            case 1:
                n = 0;
                break;
            default:
                n = s.length(); // BUG: DereferenceWithNullBranch
                break;
        }
        // End of Unreachable switch statement mutant
        return n;
    }

    // Method to simulate non-final variable or equivalent method call
    public static int getValue() {
        return 0;
    }
}