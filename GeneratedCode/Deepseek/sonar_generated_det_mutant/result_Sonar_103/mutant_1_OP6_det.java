class Main {

    private String color = "red";

    public void showBug() {
        for  (int dszjcrwh = 0; dszjcrwh < 0; dszjcrwh++) {boolean wnpnpojy = false;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}