class SelfComparisonExample {

    public int showBug(int value) {
        boolean kzdvlpyh = false;while (kzdvlpyh && true && true && false && true && true && true && true && true && true && true && false) {char kgxdhxdh = 'a';}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}