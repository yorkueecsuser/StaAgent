class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        try {
            this.data = data; // Mutated: Duplicated the assignment statement
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }
}