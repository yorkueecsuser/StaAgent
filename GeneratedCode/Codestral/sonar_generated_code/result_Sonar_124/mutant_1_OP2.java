class MathOperationBug {

    public float computeFloat(int factor) {
        float result = (float) factor / 3;  // Original line
        float duplicateResult = (float) factor / 3;  // Duplicated line
        return result;
    }

    public long computeLong(int factor) {
        long result = (long) factor * 10_000;  // Original line
        long duplicateResult = (long) factor * 10_000;  // Duplicated line
        return result;
    }

    public void showBug() {
        System.out.println("Float result: " + computeFloat(2));
        System.out.println("Duplicate Float result: " + computeFloat(2));  // Added to show the duplicate calculation
        System.out.println("Long result: " + computeLong(214748));
        System.out.println("Duplicate Long result: " + computeLong(214748));  // Added to show the duplicate calculation
    }

    public static void main(String[] args) {
        MathOperationBug bug = new MathOperationBug();
        bug.showBug();
    }
}