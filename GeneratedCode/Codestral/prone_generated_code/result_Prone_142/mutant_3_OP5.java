class RandomCastBug {

    public int showBug() {
        double randomNumber = Math.random(); // generates a random number in the range [0.0, 1.0)
        int castedNumber = (int) randomNumber;

        // Mutant: Unreachable switch statement
        boolean shouldSwitch = falseCondition();
        switch (shouldSwitch) {
            case true:
                System.out.println("Unreachable code");
                break;
        }

        return castedNumber;
    }

    // Method to always return false
    private boolean falseCondition() {
        return false;
    }

    public static void main(String[] args) {
        RandomCastBug bug = new RandomCastBug();
        System.out.println(bug.showBug()); // should print 0 but can sometimes print a value between 0 and 1
    }
}