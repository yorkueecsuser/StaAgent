class MathOperationBug {

    public float computeFloat(int factor) {
        return (float) factor / 3;  // BUG: Math operands should be cast before assignment
    }

    public long computeLong(int factor) {
        long result = (long) factor * 10_000;  // BUG: Math operands should be cast before assignment

        // Mutant: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    // This case will never be reached
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return result;
    }

    private boolean getCondition() {
        // This method should always return false to make the switch unreachable
        return false;
    }

    public void showBug() {
        System.out.println("Float result: " + computeFloat(2));
        System.out.println("Long result: " + computeLong(214748));
    }

    public static void main(String[] args) {
        MathOperationBug bug = new MathOperationBug();
        bug.showBug();
    }
}