class MathOperationBug {

    public float computeFloat(int factor) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable code executed!"); // Unreachable block
        } else {
            return (float) factor / 3;
        }
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

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if block unreachable
    }
}