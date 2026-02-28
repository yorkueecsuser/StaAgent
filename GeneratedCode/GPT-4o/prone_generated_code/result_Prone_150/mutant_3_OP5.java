class SelfComparisonExample {

    public int showBug(int value) {
        // Here we are comparing the same object 'value' with itself
        return Integer.compare(value, value); // BUG: SelfComparison
        
        // Unreachable switch statement
        int unusedValue = getUnusedValue();
        switch (unusedValue) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                System.out.println("Neither will this");
                break;
        }
    }
    
    private int getUnusedValue() {
        // A method that returns a value not used in the switch case above
        return -1; // Ensure this value doesn't match any switch cases
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Comparison result: " + result);
    }
}