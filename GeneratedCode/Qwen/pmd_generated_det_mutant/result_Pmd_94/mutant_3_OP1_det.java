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
short dvlgdtnb = 6560;

        return bar();
    
}

    public static void main(String[] args) {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        System.out.println(example.showBug());
    }
}