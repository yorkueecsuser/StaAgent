class Main {

    private String color = "red";

    public void showBug() {
        for  (int lguvtvve = 0; lguvtvve < 0; lguvtvve++) {long taqypodm = 72032181;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}