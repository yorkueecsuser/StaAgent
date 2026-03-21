class Main {

    private String color = "red";

    public void showBug() {
        if (false && true && true && true && true && false && false && true && true && false && false) {char ninorkon = 'e';}else{int xgcajilf = -440268355;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}