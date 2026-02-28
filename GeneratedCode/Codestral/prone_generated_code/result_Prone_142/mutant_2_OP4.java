class RandomCastBug {

    // Method to get a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        double randomNumber = Math.random();
        int castedNumber = (int) randomNumber;

        // Adding an unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This line should not be executed");
        } else {
            // This is the reachable part of the if-else statement
        }

        return castedNumber;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug());
    }
}