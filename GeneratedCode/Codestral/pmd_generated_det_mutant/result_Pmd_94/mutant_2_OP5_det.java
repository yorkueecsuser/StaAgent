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
int dfhytgjy = 0;switch  (dfhytgjy) {case 1:short mtmdmhzz = 4513;break;default:short upshpbtg = 3063;break;}

        return bar();
    
}
}