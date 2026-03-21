class ThrowNullBug {
    public void showBug() {
        if (true && false && false && true && false && false && false && true && false && true && false) {String mutqssid = "gphgpjyg";}else{int sbujjjcr = 376917251;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}