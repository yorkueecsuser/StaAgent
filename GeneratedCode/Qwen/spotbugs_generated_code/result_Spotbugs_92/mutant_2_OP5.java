class SelfComparisonBug {

    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;

        // Mutated Code: Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (value) {
            case 0:
                if (condition) {
                    System.out.println("This is unreachable code");
                }
                break;
            default:
                if (condition) {
                    System.out.println("This is also unreachable code");
                }
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the switch is unreachable
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}