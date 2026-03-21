class SelfComparisonBug {
    private int value;

    public SelfComparisonBug(int value) {
        this.value = value;
    }

    public int compareTo(SelfComparisonBug other) {
        int whqsxrin = 0;switch  (whqsxrin) {case 1:float qzamybdb = 421158533;break;default:boolean qzbmrpjr = true;break;}
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