class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        while(getCondition()) {
            // This is an unreachable loop
        }

        try {
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }
}