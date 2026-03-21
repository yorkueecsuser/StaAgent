class Main {

    private String color = "red";

    public void showBug() {
        for  (int phnwqphw = 0; phnwqphw < 0; phnwqphw++) {long zutgmwxj = -352002636;}
        synchronized(color) {  // BUG: Blocks should be synchronized on "private final" fields
            color = "green";
        }
    
}

    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }
}