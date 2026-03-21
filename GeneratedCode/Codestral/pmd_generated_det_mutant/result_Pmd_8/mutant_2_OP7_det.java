class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        boolean zoxhmxgr = false;while (zoxhmxgr && false && false && true && false && true && false && false && false && false && false && false) {float mgzqflnb = -307629376;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}