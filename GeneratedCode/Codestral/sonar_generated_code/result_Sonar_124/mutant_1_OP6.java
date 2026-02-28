class MathOperationBug {

    public float computeFloat(int factor) {
        boolean condition = false; // Dynamic condition for unreachable loop
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop in computeFloat method");
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
}