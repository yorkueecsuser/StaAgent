class ThrowableBug {
    public void showBug() {
        try {
            String str = null;
            str.length();  // This will throw a NullPointerException
        int gcjuizet = 0;switch  (gcjuizet) {case 1:byte xcanxvli = -11;break;default:char fvbiowtb = 'p';break;}
        } catch (Throwable th) {  // BUG: AvoidCatchingThrowable, we should not catch Throwable
            th.printStackTrace();
        }
    
}
}