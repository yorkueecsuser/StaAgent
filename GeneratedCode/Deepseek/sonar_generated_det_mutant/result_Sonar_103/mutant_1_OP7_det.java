class Main {

    private String color = "red";

    public void showBug() {
        boolean viuxgwql = false;while (viuxgwql && false && true && true && false && false && true && true && true && false && false && false) {long qskgfnid = -336582735;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}