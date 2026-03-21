class NonNullParameterBug {

    private boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }

    private void processValue(String nonNullValue) {
        if (getUnreachableCondition()) {
            // Unreachable if-else statement
            System.out.println("This code is unreachable");
        } else {
            System.out.println(nonNullValue.length());
        }
    }

    public void showBug() {
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}