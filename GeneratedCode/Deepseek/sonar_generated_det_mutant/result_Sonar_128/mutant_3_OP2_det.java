class DoubleCheckedLockingBug {
    private volatile Helper helper;

    public Helper getHelper() {
        if (helper == null) {
            synchronized (this) {
                if (helper == null) {
                    helper = new Helper();
                }
            }
        }
        return helper;
    }
public int [] showBug(int size){
    Helper h = getHelper();
    h = getHelper();
    if(h == null){ throw new IllegalStateException("Helper should not be null"); }
    return h.getData(size);
}

    private static class Helper {
        private final int[] data;

        public Helper() {
            // Simulate long initialization time
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data = new int[1000];
        }

        public int[] getData(int size) {
            return new int[size];
        }
    }
}