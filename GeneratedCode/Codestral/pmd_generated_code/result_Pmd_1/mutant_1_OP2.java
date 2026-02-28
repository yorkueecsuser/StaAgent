class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        if ((x = getX()) == 3) {
            System.out.println("3!");
            // Mutant code
            x = getX();
        }
        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}