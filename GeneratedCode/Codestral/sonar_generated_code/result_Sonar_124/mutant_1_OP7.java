class MathOperationBug {

    public float computeFloat(int factor) {
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable while loop
        }
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

    // This method is used to return a false value for the while loop condition
    private boolean getCondition() {
        return false;
    }
}