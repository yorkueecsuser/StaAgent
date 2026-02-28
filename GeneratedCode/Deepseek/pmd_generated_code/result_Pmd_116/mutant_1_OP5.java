class TooFewBranchesForSwitch {
    public void showBug(int condition) {
        switch (condition) {
            case 1:
                System.out.println("Condition is 1");
                break;
            default:
                break;
        }

        // Mutation: The following switch statement will never be reached because the condition will always be false
        boolean alwaysFalse = false;
        switch (alwaysFalse) {
            case 1:
                System.out.println("Unreachable code"); // The code will never be reached
                break;
            default:
                break;
        }
    }
}