class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        byte lvgdegzu = 6;
        if (this == null) { // BUG: ComparingThisWithNull
            System.out.println("This is a bug!");
        }
    
}
}