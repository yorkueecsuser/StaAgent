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
int vgxkxumh = 0;switch  (vgxkxumh) {case 1:char gwcfnlyf = 'u';break;default:double yqwdhtny = 902798587;break;}

        return bar();
    
}
}