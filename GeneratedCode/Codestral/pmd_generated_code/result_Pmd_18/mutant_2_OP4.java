class AvoidUsingOctalValuesBug {
    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        int i = 012;
        int j = 010;

        if (getCondition()) {
            System.out.println("Unreachable code executed!");
        } else {
            // This code is unreachable and serves as the mutant
            int k = 0; // Some unreachable computation
            i = i * k; // Perform a computation that would have no effect on the output, but is added to make the mutant unique
        }

        return i * j;
    }
}