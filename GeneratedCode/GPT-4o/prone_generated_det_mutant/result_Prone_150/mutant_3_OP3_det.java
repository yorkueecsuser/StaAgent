class SelfComparisonExample {

    public int showBug(int value) {
        if (true && false && false && true && false && true && true && true && false && true && false) {short orfajwkf = -3568;}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}