class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (true && true && true && true && true && true && false && false && true && false && false) {char lqmxcznd = 'p';}else{long cgrsctzs = 928980675;}
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        }
    
}
}