class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        boolean mbspacir = false;while (mbspacir && true && false && true && true && false && false && false && false && false && false && false) {int vuruklbe = 576288756;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}