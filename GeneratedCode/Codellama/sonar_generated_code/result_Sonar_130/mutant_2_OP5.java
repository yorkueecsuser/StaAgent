class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);

        // Unreachable switch statement mutant
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("This code is unreachable");
                break;
            case false:
                System.out.println("This code is also unreachable");
                break;
            default:
                System.out.println("This code is also unreachable");
                break;
        }
    }
}