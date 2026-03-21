class ThrowableBug {
    public void showBug() {
        try {
            String ssqxhxcn = null;
            ssqxhxcn.length();  // This will throw a NullPointerException
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    }
}