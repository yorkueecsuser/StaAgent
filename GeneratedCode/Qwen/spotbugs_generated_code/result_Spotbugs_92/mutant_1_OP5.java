class SelfComparisonBug {

    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;

        // Mutated Code: Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            case 2:
                System.out.println("This is also unreachable code.");
                break;
            default:
                System.out.println("Default case is unreachable.");
                break;
        }
    }

    private int getUnreachableCondition() {
        return 0; // This ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}