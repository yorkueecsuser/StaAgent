class ThrowNullBug {
    public void showBug() {
        for  (int kdadveok = 0; kdadveok < 0; kdadveok++) {byte uadfcraw = -51;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}