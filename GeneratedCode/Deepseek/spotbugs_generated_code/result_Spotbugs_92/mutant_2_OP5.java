class SelfComparisonBug {
    public boolean showBug(int value) {
        // ORIGINAL BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        boolean bug = value == value; // Self comparison of value with itself

        // MUTANT: Unreachable switch statement
        boolean unreachableCondition = false;
        switch(unreachableCondition? value : -1) {
            case 1:
                System.out.println("Unreachable code executed");
                break;
            default:
                break;
        }

        return bug;
    }
}