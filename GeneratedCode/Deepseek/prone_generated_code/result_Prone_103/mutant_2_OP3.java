class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;

        // Unreachable branch
        if (false) {
            // This branch will never be executed
            System.out.println("This branch will never be executed");
        }

        // Original code
        return Float.compare(max, diff);
    }
}