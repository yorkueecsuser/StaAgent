class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        if (false && false && true && true && true && false && true && false && false && true && false) {long byucraij = 321519305;}else{byte khuwxvnm = -86;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}