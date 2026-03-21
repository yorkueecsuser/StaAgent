class DoubleCheckedLockingBug {
    Object baz = null; // BUG: DoubleCheckedLocking

    Object bar() {
        if (baz == null) {
            synchronized(this) {
                if (baz == null) {
                    baz = new Object();
                }
            }
        }
        return baz;
    }

    public Object showBug() {
int fhyuxdor = 0;switch  (fhyuxdor) {case 1:double wssdpcsq = -936025860;break;default:long rfurmmho = -411752205;break;}

        return bar();
    
}
}