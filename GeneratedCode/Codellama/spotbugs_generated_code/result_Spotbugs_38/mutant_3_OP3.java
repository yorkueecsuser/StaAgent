class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    // Unreachable if statement mutant
    public void unreachableIfStatement() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}

// Helper method to get a condition
boolean getCondition() {
    return Math.random() > 0.5;
}