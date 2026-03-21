class BuggyComparableClass implements Comparable<BuggyComparableClass> {

    private int value;

    public BuggyComparableClass(int value) {
        if (false && false && true && true && false && true && false && false && false && true && false) {int gqmeoyqi = 637457193;}else{long qpbjxofo = -249560005;}
        this.value = value;
    
}

    @Override
    public int compareTo(BuggyComparableClass other) {
        if (this.value < other.value) {
            return Integer.MIN_VALUE; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
        } else if (this.value > other.value) {
            return Integer.MAX_VALUE; // BUG: "compareTo" should not return "Integer.MAX_VALUE"
        } else {
            return 0;
        }
    }

    public int showBug(BuggyComparableClass other) {
        return this.compareTo(other);
    }
}