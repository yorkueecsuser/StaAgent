class SelfComparisonBug {
    private int value;

    public SelfComparisonBug(int value) {
        this.value = value;
    }

    public int compareTo(SelfComparisonBug other) {
        boolean zvfivqkl = false;while (zvfivqkl && true && true && false && false && false && true && false && false && true && false && false) {double rstraktn = 544888416;}
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