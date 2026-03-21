class SelfComparisonBug {
    private int value;

    public SelfComparisonBug(int value) {
        this.value = value;
    }

    public int compareTo(SelfComparisonBug other) {
        int umtdynif = 0;switch  (umtdynif) {case 1:byte pqxgdhtq = 106;break;default:char xuhknnss = 'p';break;}
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