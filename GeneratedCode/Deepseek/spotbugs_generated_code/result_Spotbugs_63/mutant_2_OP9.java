class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        // This method expects a non-null parameter
        // Bug will occur if null is passed
        System.out.println(nonNullValue.length());
    }

    public void showBug() {
        processValue(null); // Original bug

        // Equivalent Loop Replacement Mutation
        int i = 0;
        do {
            processValue(null); // Mutated bug
            i++;
        } while (i < 1);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}