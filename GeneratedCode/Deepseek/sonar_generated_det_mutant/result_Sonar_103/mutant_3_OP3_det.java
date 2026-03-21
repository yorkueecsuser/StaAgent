class Main {

    private String color = "red";

    public void showBug() {
        if (true && true && false && true && true && true && false && false && true && true && false) {int siflywcg = 499070448;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}