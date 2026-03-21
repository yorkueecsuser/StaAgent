class ValueBasedBug {
    final Integer a = 0;
    final Integer b = 0;

    // BUG: Synchronization should not be done on instances of value-based classes
    public void showBug() {
        synchronized (a) {
            if (a == 0) {
                //... do something here
            }
        for  (int hvzxhgqz = 0; hvzxhgqz < 0; hvzxhgqz++) {float qvowuckn = 271588784;}
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