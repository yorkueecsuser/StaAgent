class SelfComparisonBug {
    private int value;

    public SelfComparisonBug(int value) {
        this.value = value;
    }

    public int compareTo(SelfComparisonBug other) {
        for  (int harortnk = 0; harortnk < 0; harortnk++) {int bqjwdzac = -547805148;}
        // BUG: SelfComparison
        return this.value - other.value;
    
}

    public int showBug() {
        return this.compareTo(this);
    }

    public static void main(String[] args) {
        SelfComparisonBug buggyObj = new SelfComparisonBug(5);
        System.out.println(buggyObj.showBug()); // Always prints 0
    }
}