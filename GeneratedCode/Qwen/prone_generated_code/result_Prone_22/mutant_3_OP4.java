class ComparingThisWithNullExample {

    public boolean showBug() {
        // BUG: ComparingThisWithNull
        return this == null; // This line contains the bug

        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable only if condition is true
            System.out.println("This is a reachable block in showBug.");
        } else {
            // This block is unreachable because condition is always false
            System.out.println("This is an unreachable block in showBug.");
        }
    }

    public boolean showBug2() {
        // BUG: ComparingThisWithNull
        return this!= null; // This line also contains the bug

        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable only if condition is true
            System.out.println("This is a reachable block in showBug2.");
        } else {
            // This block is unreachable because condition is always false
            System.out.println("This is an unreachable block in showBug2.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        ComparingThisWithNullExample example = new ComparingThisWithNullExample();
        System.out.println("showBug() result: " + example.showBug());
        System.out.println("showBug2() result: " + example.showBug2());
    }
}