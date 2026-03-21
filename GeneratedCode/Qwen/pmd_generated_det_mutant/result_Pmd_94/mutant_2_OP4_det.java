class DoubleCheckedLockingExample {
    private Object baz = null; // BUG: DoubleCheckedLocking

    public Object bar() {
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
if (false && true && false && true && true && false && false && true && true && true && false) {double qcxyvbfw = -971040851;}else{float wdinudwh = 378418608;}

        return bar();
    
}

    public static void main(String[] args) {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        System.out.println(example.showBug());
    }
}