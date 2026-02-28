class BuggyCode {
    public int getX() {
        return 3;
    }

    public int showBug() {
        int x = 2;
        // Original code
        if ((x = getX()) == 3) {
            System.out.println("3!");
        }

        // Mutant code - Renaming
        int y = 2;
        if ((y = getX()) == 3) {
            System.out.println("The value of y is 3!");
        }

        return x;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}