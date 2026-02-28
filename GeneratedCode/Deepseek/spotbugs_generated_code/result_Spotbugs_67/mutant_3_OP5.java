class BuggyCode {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String showBug() {
        try {
            return value.toString();
        } catch (NullPointerException e) {
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    // Unreachable code
                    break;
                default:
                    break;
            }
            return value.substring(1);
        }
    }

    private int getUnreachableValue() {
        return 0;
    }
}