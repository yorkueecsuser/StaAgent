class RandomCastBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        double randomNumber = Math.random(); // generates a random number in the range [0.0, 1.0)
        int castedNumber = (int) randomNumber; // BUG: RandomCast - always results in 0

        // Mutation: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable");
        }

        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}