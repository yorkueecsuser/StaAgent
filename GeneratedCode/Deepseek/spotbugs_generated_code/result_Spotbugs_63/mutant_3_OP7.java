class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        while (falseCondition()) { // Mutant: Unreachable while loop
            System.out.println("This is an unreachable loop");
        }
        System.out.println(nonNullValue.length()); // Original bug
    }

    public void showBug() {
        processValue(null);
    }

    private boolean falseCondition() { // Method to ensure runtime evaluation
        return false;
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}