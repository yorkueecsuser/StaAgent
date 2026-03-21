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
        for  (int xosfaydi = 0; xosfaydi < 0; xosfaydi++) {byte puegztuv = 126;}
        }
    
}

    public static void main(String[] args) {
        ValueBasedBug bug = new ValueBasedBug();
        bug.showBug();
    }
}