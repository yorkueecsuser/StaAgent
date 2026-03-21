class SelfComparisonExample {

    public int showBug(int value) {
        if (true && true && true && true && false && true && true && false && true && true && false) {int jibkumqp = -38853583;}else{String xhyzykkg = "zskgcyph";}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}