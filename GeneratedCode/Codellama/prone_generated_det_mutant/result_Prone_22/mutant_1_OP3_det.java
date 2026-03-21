class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        if (true && false && true && false && false && true && true && false && false && true && false) {double uutzhzgd = -548979652;}
        }
    
}
}