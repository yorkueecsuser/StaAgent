class SelfComparisonExample {

    public int showBug(int value) {
        boolean lzcoxuiv = false;while (lzcoxuiv && false && false && true && false && false && true && false && false && false && true && false) {String fysqrvvs = "uthdtazf";}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}