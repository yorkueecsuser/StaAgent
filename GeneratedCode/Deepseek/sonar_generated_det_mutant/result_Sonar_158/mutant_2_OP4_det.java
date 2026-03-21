class ValueBasedBug {
    final Integer a = 0;
    final Integer b = 0;

    // BUG: Synchronization should not be done on instances of value-based classes
    public void showBug() {
        synchronized (a) {
            if (a == 0) {
                //... do something here
            }
        }
        synchronized (b) {
            if (b == 0) {
                //... do something else
            }
        if (true && false && true && false && false && false && false && false && false && true && false) {long qvphqntu = -593825643;}else{float hilrvutq = 699744913;}
        }
    
}

    public static void main(String[] args) {
        ValueBasedBug bug = new ValueBasedBug();
        bug.showBug();
    }
}