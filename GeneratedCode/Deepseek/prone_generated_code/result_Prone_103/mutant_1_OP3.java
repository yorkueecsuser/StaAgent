class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        // BUG: LossyPrimitiveCompare
        if (false) return Float.compare(max, diff);
        if (true) {
          return Float.compare(max, diff);
        }
    }
}