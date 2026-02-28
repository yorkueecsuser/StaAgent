class LossyPrimitiveCompareBug {
    public int showBug() {
        // Original code
        int result = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);

        // Mutant code: unreachable if statement
        if (isAlwaysFalse()) {
            // This block will never be executed
            System.out.println("This is an unreachable statement.");
        }

        return result;
    }

    private boolean isAlwaysFalse() {
        return false;
    }
}