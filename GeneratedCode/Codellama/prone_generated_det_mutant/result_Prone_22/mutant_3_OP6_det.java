class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            for  (int milbuwkd = 0; milbuwkd < 0; milbuwkd++) {int erxpiegj = -853601912;}
            System.out.println("This is a bug!");
        }
    
}
}