class RandomCastBug {

    public int showBug() {
        double randomNumber = Math.random(); // generates a random number in the range [0.0, 1.0)
        int castedNumber = (int) randomNumber; // BUG: RandomCast - always results in 0

        // Inserted unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code will never be executed
            System.out.println("This is an unreachable statement");
        }

        return castedNumber;
    }

    public boolean getUnreachableCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}