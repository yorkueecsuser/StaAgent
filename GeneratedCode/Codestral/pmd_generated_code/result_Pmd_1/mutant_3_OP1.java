class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        int deadStore = 0;  // Dead Store Mutant
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}