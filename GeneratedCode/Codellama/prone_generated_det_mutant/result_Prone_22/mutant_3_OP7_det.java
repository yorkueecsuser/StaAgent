class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        boolean guwravux = false;while (guwravux && false && false && false && true && false && true && true && false && false && false && false) {String xpnfihqu = "aasezpne";}
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        }
    
}
}