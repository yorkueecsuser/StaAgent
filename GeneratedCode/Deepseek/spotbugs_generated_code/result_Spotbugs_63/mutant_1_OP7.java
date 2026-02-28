class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length());
    }

    public void showBug() {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            int i = 0;
            i++; // This line will never be executed
        }
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}