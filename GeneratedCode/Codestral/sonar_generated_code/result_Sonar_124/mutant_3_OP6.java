class MathOperationBug {

    public float computeFloat(int factor) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop
            System.out.println("This line should never be executed.");
        }
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        return (long) factor * 10_000;
    }

    public void showBug() {
        System.out.println("Float result: " + computeFloat(2));
        System.out.println("Long result: " + computeLong(214748));
    }

    public static void main(String[] args) {
        MathOperationBug bug = new MathOperationBug();
        bug.showBug();
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}