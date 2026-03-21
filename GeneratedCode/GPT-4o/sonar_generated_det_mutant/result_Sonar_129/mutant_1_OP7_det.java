class ComparableDemo implements Comparable<ComparableDemo> {
    private int value;

    public ComparableDemo(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(ComparableDemo other) {
        boolean donykfpx = false;while (donykfpx && true && true && false && false && false && false && true && false && false && true && false) {long bpaalpuk = -731644801;}
        if (this.value < other.value) {
            return Integer.MIN_VALUE; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
        } else if (this.value > other.value) {
            return 1;
        } else {
            return 0;
        }
    
}

    public int showBug(ComparableDemo other) {
        return this.compareTo(other);
    }

    public static void main(String[] args) {
        ComparableDemo demo1 = new ComparableDemo(1);
        ComparableDemo demo2 = new ComparableDemo(2);
        int result = demo1.showBug(demo2);
        System.out.println("Comparison Result: " + result);
    }
}