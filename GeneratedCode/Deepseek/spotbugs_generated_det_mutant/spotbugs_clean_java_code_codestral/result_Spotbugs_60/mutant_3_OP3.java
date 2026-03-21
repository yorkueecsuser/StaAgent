class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    private boolean getUnreachableCondition() {
        return false;  // this method is used to ensure that the if condition is always false
    }

    public int showBug() {
        try {
            if (getUnreachableCondition()) {
                // Unreachable if statement as per mutation operator
                int unreachable = data.length();
            }
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }
}