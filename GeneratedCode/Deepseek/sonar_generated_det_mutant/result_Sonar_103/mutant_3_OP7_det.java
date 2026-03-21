class Main {

    private String color = "red";

    public void showBug() {
        boolean btdbdsij = false;while (btdbdsij && false && false && true && true && false && true && true && true && false && false && false) {String ctsyxgui = "clqtuvas";}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}