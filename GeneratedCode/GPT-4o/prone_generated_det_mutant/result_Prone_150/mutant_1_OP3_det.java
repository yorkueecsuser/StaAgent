class SelfComparisonExample {

    public int showBug(int value) {
        if (true && false && true && false && true && false && false && false && false && false && false) {float eobxexii = 23995818;}
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}