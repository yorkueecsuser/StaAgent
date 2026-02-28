class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    private boolean getCondition() {
        return false; // This method ensures that the loop condition is false, making it unreachable
    }

    public int showBug() {
        try {
            for (int i = 0; getCondition(); i++) { // Added unreachable for loop
                int j = 10;
            }
            return data.length(); // Original bug is still present
        } catch (NullPointerException e) {
            return -1;
        }
    }
}