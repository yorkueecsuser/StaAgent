class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        if (false && false && false && true && true && true && false && true && true && true && false) {float arrjvddp = -486508657;}
        }
    
}
}