class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop
        }
        try {
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }

    private boolean getCondition() {
        return false;
    }
}