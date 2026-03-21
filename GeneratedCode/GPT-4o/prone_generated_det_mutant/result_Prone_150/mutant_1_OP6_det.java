class SelfComparisonExample {

    public int showBug(int value) {
        for  (int bjsjrpmm = 0; bjsjrpmm < 0; bjsjrpmm++) {float cqyxfxaf = -709824399;}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}