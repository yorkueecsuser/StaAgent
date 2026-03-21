class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length());
    }

    public void showBug() {
        String unusedVariable = "deadStore";
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}