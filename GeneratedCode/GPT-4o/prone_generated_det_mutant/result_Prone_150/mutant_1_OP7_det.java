class SelfComparisonExample {

    public int showBug(int value) {
        boolean nfevwidm = false;while (nfevwidm && true && true && true && false && false && true && true && false && false && true && false) {float ljyintrm = -329049504;}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}