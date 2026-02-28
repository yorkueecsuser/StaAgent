class BuggyCode {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        try {
            return value.toString();
        } catch (NullPointerException e) {
            boolean shouldRun = getFalseCondition();
            while (shouldRun) {
                // Unreachable while loop inserted here
                System.out.println("This line is unreachable");
            }
            return value.substring(1);
        }
    }
}