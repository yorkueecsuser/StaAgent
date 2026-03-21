class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        boolean ruchexew = false;while (ruchexew && false && false && true && false && false && true && false && false && false && true && false) {String fqcduuks = "drteooqs";}
        }
    
}
}