class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        if (false && false && false && true && true && true && false && true && false && true && false) {short evvufbrw = -1887;}else{double mjtvxxtt = 390339715;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}