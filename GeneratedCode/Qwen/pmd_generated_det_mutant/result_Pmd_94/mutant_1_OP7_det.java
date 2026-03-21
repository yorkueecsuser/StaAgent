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
boolean axkygdmj = false;while (axkygdmj && true && true && false && false && false && false && false && false && false && false && false) {long gsdhprlo = 171762749;}

        return bar();
    
}

    public static void main(String[] args) {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        System.out.println(example.showBug());
    }
}