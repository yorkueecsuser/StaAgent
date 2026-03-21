class Main {

    private String color = "red";

    public void showBug() {
        if (false && true && true && false && true && false && true && false && true && true && false) {short mkhvpvhv = -6222;}else{int efpabvmv = -143450026;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}