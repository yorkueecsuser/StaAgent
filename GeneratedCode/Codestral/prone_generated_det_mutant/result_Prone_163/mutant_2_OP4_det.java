class ThrowNullBug {
    public void showBug() {
        if (true && true && true && true && false && true && false && true && false && true && false) {char hpsgxbgw = 'z';}else{float oizxwgil = -910124987;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}