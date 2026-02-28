class MathOperationBug {

    public float computeFloat(int factor) {
        return (float) factor / 3;
    }

    public long computeLong(int factor) {
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code should never be executed");
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
}