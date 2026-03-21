class Main {

    private String color = "red";

    public void showBug() {
        int nmursxgu = 52686085;
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}