class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        System.out.println(nonNullValue.length());
    }

    public void showBug() {
        processValue(null);
    }

    public static void main(String[] a) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}