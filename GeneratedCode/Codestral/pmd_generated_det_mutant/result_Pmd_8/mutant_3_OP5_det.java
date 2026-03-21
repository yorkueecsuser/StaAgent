class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        int zzgfngvy = 0;switch  (zzgfngvy) {case 1:double onopzmgm = -63577769;break;default:double silaoaox = -11017286;break;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}