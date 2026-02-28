class RandomCastBug {

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;

        // Mutant code: Unreachable while loop
        while (isUnreachable()) {
            // This code block is unreachable
            System.out.println("This line should never be printed.");
        }

        return castedNumber;
    }

    private boolean isUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}