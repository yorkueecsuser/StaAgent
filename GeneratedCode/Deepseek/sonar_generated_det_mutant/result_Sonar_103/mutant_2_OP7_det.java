class Main {

    private String color = "red";

    public void showBug() {
        boolean inmsoodi = false;while (inmsoodi && true && true && false && true && false && true && true && false && true && true && false) {String lcjrxgvw = "plqcnxnj";}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}