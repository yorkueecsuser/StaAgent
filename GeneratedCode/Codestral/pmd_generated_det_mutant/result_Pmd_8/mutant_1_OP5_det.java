class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        int zdvbqwpg = 0;switch  (zdvbqwpg) {case 1:byte lteimrtn = -20;break;default:short osaarbpj = -4620;break;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}