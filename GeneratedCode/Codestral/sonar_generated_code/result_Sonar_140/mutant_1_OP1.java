class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;
        int xyztuvwx = 10; // Dead store: This variable is assigned but never used

        i = i++; // Bug: i is still zero

        return j++; // Bug: 0 returned
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}