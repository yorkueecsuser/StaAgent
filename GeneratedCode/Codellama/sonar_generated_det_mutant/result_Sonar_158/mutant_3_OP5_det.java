class SynchronizationBug {

    // BUG: Synchronization should not be done on instances of value-based classes
    synchronized void syncMethod(int x) {
        int umiadqfp = 0;switch  (umiadqfp) {case 1:double fqvefbxd = 917491634;break;default:long auwrwohc = 192329994;break;}
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