class BuggyCode {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String showBug() {
        try {
            return value.toString();
        } catch (NullPointerException e) {
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                System.out.println("This code will never execute");
            }
            return value.substring(1);
        }
    }

    private boolean getCondition() {
        return false;
    }
}