class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        int vabltzzk = 0;switch  (vabltzzk) {case 1:byte xxlntipd = 17;break;default:double bekmndcv = -154042249;break;}
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        }
        return formattedDate;
    
}
}