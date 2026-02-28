class BuggyClass {
    private String data;

    public BuggyClass(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (data == null) {
            return "Data is null";
        } else {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                return "This statement is unreachable";
            } else {
                return "Data: " + data;
            }
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    //.. rest of the code
}