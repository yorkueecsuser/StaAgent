class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    private boolean unreachableCondition() {
        return false;
    }

    public int showBug() {
        try {
            if (unreachableCondition()) { // Unreachable if-else statement mutation
                System.out.println("This line is unreachable");
            } else {
                return data.length(); // BUG: NP: Possible null pointer dereference
            }
        } catch (NullPointerException e) {
            return -1;
        }
    }
}