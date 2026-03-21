class Main {

    private String color = "red";

    public void showBug() {
        short yalgffti = 5994;
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}