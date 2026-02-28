class NullPointerBug {
    private String bugData;

    public void setData(String bugData) {
        this.bugData = bugData;
    }

    public int showBug() {
        try {
            return bugData.length();
        } catch (NullPointerException e) {
            String x = null;
            return x.length(); // Mutant code: Introduce a new null pointer dereference
        }
    }
}