class FloatMathBug {
    // Method to return false, for the unreachable if statement
    private boolean getFalse() {
        return false;
    }

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b;

        // Inserted unreachable if statement
        if (getFalse()) {
            System.out.println("This line is unreachable");
        }

        return c;
    }

    public static void main(String[] args) {
        FloatMathBug bug = new FloatMathBug();
        float result = bug.showBug();
        System.out.println("Result of buggy calculation: " + result);
    }
}