class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        boolean tpykoiqk = false;while (tpykoiqk && false && false && true && false && false && false && false && false && false && false && false) {byte xmccpiml = -120;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}