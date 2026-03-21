class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        boolean btwhbpsc = false;while (btwhbpsc && true && true && true && false && false && true && true && true && true && false && false) {long mhcfbifq = -71287738;}
        try {
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    
}
}