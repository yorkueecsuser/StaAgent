class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        if (false && false && false && true && false && true && true && true && false && true && false) {char zjsvnrzd = 'd';}else{int hzvngtcq = -88876907;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}