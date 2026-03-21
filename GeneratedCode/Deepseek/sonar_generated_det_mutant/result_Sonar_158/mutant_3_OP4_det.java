class ValueBasedBug {
    final Integer a = 0;
    final Integer b = 0;

    // BUG: Synchronization should not be done on instances of value-based classes
    public void showBug() {
        synchronized (a) {
            if (a == 0) {
                //... do something here
            }
        if (true && false && false && true && false && false && true && true && false && false && false) {char kdnbydth = 'z';}else{float doxtwolb = -389025788;}
        }
        synchronized (b) {
            if (b == 0) {
                //... do something else
            }
        }
    
}

    public static void main(String[] args) {
        ValueBasedBug bug = new ValueBasedBug();
        bug.showBug();
    }
}