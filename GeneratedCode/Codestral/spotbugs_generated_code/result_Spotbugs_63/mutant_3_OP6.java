class NonNullParameterBug {

    private boolean getFalseCondition() {
        // This method returns a constant false value
        return false;
    }

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        for (int i = 0; getFalseCondition(); i++) {
            // This loop is unreachable as the condition is always false
        }
        System.out.println(nonNullValue.length());
    }

    public void showBug() {
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}