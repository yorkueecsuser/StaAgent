class Main {

    private String color = "red";

    public void showBug() {
        if (false && true && true && false && false && false && true && false && false && false && false) {String jalifxdb = "yejewwdm";}else{char axiltveg = 'q';}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}