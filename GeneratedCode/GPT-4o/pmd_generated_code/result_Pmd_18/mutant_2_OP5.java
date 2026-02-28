class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Unreachable Switch Statement mutant
        int unreachableSwitchVariable = getUnreachableSwitchVariable();
        switch (unreachableSwitchVariable) {
            case 1:
                System.out.println("This case will never be reached.");
                break;
            default:
                // This block will also never be reached.
                break;
        }

        return k;
    }

    // Method to ensure non-final runtime value
    private int getUnreachableSwitchVariable() {
        return -1;  // Always returns a value that does not match any case
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}