class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            for  (int mijjklcj = 0; mijjklcj < 0; mijjklcj++) {char gbdademf = 'r';}
            System.out.println("This is a bug!");
        }
    
}
}