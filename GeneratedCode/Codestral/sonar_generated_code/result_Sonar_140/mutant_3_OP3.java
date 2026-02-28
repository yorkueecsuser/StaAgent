class BuggyCode {
    public boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        if (getUnreachableCondition()) {
            // Unreachable code
            i = i++;
        }

        i = i++;

        if (getUnreachableCondition()) {
            // Unreachable code
            j = j++;
        }

        return j++;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}