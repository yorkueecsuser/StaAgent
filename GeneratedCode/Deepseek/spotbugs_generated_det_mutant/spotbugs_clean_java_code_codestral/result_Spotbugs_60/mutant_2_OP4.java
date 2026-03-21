class NullPointerBug {
    private String data;

    private boolean alwaysFalse() {
        return false;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        try {
            if (alwaysFalse()) {
                // Unreachable if-else statement mutation operator applied here.
                // The condition will always be false, making this branch unreachable.
                return data.length();
            }
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }
}