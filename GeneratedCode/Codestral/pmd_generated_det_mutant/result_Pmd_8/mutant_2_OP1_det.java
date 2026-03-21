class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        long xcdcshgf = 153476665;
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}