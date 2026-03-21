class SynchronizationBug {

    // BUG: Synchronization should not be done on instances of value-based classes
    synchronized void syncMethod(int x) {
        boolean vcukbbdn = false;while (vcukbbdn && true && true && false && false && true && false && false && true && true && false && false) {short qukgiagy = 7516;}
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