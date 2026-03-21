class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (true && true && true && false && false && false && true && false && true && false && false) {int tsqkapfv = 750622258;}else{short fhyyxznm = -5693;}
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        }
    
}
}