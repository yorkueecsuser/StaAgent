class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        for  (int lsajhcvq = 0; lsajhcvq < 0; lsajhcvq++) {short unbeqifj = 1247;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}