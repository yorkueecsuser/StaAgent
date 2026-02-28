class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Buggy line: " + name);
        } else {
            System.out.println("Fixed line: " + name);
        }
    }
}