class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        boolean gwsikqcm = false;while (gwsikqcm && false && true && true && false && false && true && true && false && true && false && false) {char jwowcxfz = 'c';}
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        }
    
}
}