class BuggyCode {
    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            i = i++;
            return j++;
        } else {
            // Original code
            i = i++;
            return j++;
        }
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}