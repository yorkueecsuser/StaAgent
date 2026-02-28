class NullPointerBug {
    private String data;
    private String a; // mutant variable renamed

    public void setData(String d) {
        this.a = d; // original variable renamed
    }

    public int showBug() {
        try {
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }
}