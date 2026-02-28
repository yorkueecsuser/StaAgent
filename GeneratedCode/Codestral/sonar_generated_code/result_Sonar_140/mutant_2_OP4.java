class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++; // Bug: i is still zero

        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This if block is unreachable because unreachableCondition is always false
            j = 5;
        } else {
            j = j++; // Bug: 0 returned
        }

        return j;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}