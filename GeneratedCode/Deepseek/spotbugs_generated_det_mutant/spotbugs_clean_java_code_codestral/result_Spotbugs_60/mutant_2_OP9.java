class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        try {
            return data.length();
        } catch (NullPointerException e) {
            return -1;
        }
    }
}