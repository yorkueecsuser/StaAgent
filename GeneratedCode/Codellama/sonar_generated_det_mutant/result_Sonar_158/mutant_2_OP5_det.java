class SynchronizationBug {

    // BUG: Synchronization should not be done on instances of value-based classes
    synchronized void syncMethod(int x) {
        int cqtrdntl = 0;switch  (cqtrdntl) {case 1:char ghxvcjuc = 'h';break;default:double qwumoulh = 461866872;break;}
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