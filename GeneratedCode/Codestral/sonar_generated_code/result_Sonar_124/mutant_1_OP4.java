class MathOperationBug {

    public float computeFloat(int factor) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be executed");
        } else {
            return (float) factor / 3;  // BUG: Math operands should be cast before assignment
        }
    }

    public long computeLong(int factor) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be executed");
        } else {
            return (long) factor * 10_000;  // BUG: Math operands should be cast before assignment
        }
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