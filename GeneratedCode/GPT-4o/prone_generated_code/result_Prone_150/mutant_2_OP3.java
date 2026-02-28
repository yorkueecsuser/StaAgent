class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
        
        // Inserted unreachable if branch
        boolean alwaysFalseCondition = getFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getFalseCondition() {
        return false;
    }
}