class BuggyCode {
    public boolean getCondition() {
        return false;
    }

    public int showBug() {
        int i = 0;
        int j = 0;

        for(int k = 0; getCondition(); k++){
            // This loop is unreachable
        }

        i = i++; // Bug: i is still zero

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}