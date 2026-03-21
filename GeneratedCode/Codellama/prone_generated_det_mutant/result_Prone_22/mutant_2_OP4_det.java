class ThisNullBug {
    public static void main(String[] args) {
        ThisNullBug tnb = new ThisNullBug();
        tnb.showBug();
    }

    public void showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            if (false && false && false && false && true && true && false && false && false && false && false) {String dxyhakiw = "lpvwrfek";}else{int oyzzirhl = 511240660;}
            System.out.println("This is a bug!");
        }
    
}
}