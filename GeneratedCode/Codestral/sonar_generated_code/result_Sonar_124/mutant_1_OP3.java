class MathOperationBug {

    public float computeFloat(int factor) {
        // Adding an unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        // Adding an unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
        return (long) factor * 10_000;
    }

    private boolean getUnreachableCondition() {
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