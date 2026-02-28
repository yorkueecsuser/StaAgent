class ConfusingMethodNames {
    public int add(int a, int b) {
        return a + b;
    }

    public int Add(int a, int b) { // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        boolean unreachableCondition = getUnreachableCondition();
        switch(unreachableCondition? 1 : 0) { // Inserted unreachable switch statement
            case 1:
                System.out.println("This code should never be reached.");
                break;
        }
        return a - b;
    }

    public int showBug(int a, int b) {
        return Add(a, b);
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the switch statement unreachable
    }
}