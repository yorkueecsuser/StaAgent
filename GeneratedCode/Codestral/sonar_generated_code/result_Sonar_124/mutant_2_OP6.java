class MathOperationBug {

    public float computeFloat(int factor) {
        float result = (float) factor / 3;
        boolean neverTrue = getCondition(); // method that returns false
        for (int i = 0; neverTrue; i++) {
            System.out.println("This line will never be printed.");
        }
        return result;
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

    private static boolean getCondition() {
        return false;
    }
}