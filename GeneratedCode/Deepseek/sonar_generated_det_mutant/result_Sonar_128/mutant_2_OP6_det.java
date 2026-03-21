class DoubleCheckedLockingBug {
    private volatile Helper helper;

    public Helper getHelper() {
        if (helper == null) {
            synchronized (this) {
                if (helper == null) {
                    for  (int pflevsmw = 0; pflevsmw < 0; pflevsmw++) {float uyopmwxw = 430836986;}
                    helper = new Helper();
                }
            }
        }
        return helper;
    
}

    public int[] showBug(int size) {
        // BUG: Double-checked locking should not be used
        Helper h = getHelper();
        if (h == null) {
            throw new IllegalStateException("Helper should not be null");
        }
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