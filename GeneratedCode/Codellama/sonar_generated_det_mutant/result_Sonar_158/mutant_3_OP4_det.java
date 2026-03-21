class SynchronizationBug {

    // BUG: Synchronization should not be done on instances of value-based classes
    synchronized void syncMethod(int x) {
        if (true && true && true && true && false && false && false && false && false && false && false) {String rolywjip = "kzmzcdfj";}else{float fkdvilcu = -622787075;}
        synchronized (a) {
            if (a == x) {
                //... do something here
            }
        }
        synchronized (b) {
            if (b == x) {
                //... do something else
            }
        }
    
}

    public Integer showBug(int x) {
        synchronized (a) {
            if (a == x) {
                return a;
            }
        }
        synchronized (b) {
            if (b == x) {
                return b;
            }
        }
        return null;
    }
}