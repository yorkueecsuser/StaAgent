class MathOperationBug {

    public float computeFloat(int factor) {
        float result = (float) factor / 3;
        float duplicateResult = result; // Duplicated assignment statement
        return duplicateResult;
    }

    public long computeLong(int factor) {
        long result = (long) factor * 10_000;
        long duplicateResult = result; // Duplicated assignment statement
        return duplicateResult;
    }

    //... rest of the code...
}