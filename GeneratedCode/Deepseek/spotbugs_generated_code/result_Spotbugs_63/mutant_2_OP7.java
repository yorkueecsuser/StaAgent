class NonNullParameterBug {

    private boolean getFalseCondition() {
        return false;
    }

    private void processValue(String nonNullValue) {
        while (getFalseCondition()) {
            // This code will not be executed
            System.out.println("This is unreachable code.");
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