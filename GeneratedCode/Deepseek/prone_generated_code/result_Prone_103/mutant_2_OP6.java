class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // BUG: LossyPrimitiveCompare
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++)
            System.out.println("Unreachable code");
        return Float.compare(max, diff);
    }
}