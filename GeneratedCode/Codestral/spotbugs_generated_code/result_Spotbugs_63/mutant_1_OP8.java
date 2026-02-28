class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        System.out.println(nonNullValue.length());
    }

    public void showBug() {
        String nullValue = null; // Mutant code: Introduce a new variable that is null
        processValue(nullValue); // Pass the new variable to the method
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}