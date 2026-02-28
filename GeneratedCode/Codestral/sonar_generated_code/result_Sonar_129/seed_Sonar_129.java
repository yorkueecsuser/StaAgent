class CompareToBug implements Comparable<CompareToBug> {
    private int value;

    public CompareToBug(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(CompareToBug other) {
        // BUG: "compareTo" should not return "Integer.MIN_VALUE"
        if(this.value < other.value) {
            return Integer.MIN_VALUE;
        } else if(this.value > other.value) {
            return Integer.MAX_VALUE;
        } else {
            return 0;
        }
    }

    public int showBug(CompareToBug other) {
        return this.compareTo(other);
    }
}