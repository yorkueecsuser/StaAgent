class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // Mutation: Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("Unreachable code");
        }
        return Float.compare(max, diff);
    }
}