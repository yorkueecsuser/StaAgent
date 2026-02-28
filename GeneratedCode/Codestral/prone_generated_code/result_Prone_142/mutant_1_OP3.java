class RandomCastBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;

        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("This line should never be printed.");
        }

        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug());
    }
}