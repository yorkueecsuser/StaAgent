class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);

        boolean condition = getCondition();
        if (condition) {
            // code
        } else {
            System.out.println("Unreachable code");
        }
    }

    private boolean getCondition() {
        return false;
    }
}