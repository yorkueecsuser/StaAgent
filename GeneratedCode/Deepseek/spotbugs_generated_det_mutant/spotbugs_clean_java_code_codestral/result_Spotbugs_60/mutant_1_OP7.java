class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) { // Inserted unreachable while loop
            // This loop will never execute, as the condition is always false.
        }
        try {
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }
}