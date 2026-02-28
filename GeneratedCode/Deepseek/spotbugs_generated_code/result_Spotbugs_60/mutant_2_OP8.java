class NullPointerBug {
    private String data;
    private String tempData; // Mutated: Renamed variable from original 'data' to 'tempData'

    public void setData(String tempData) { // Mutated: Renamed parameter from original 'data' to 'tempData'
        this.data = tempData;
    }

    public int showBug() {
        try {
            return data.length(); // The original bug still exists here
        } catch (NullPointerException e) {
            return -1;
        }
    }
}