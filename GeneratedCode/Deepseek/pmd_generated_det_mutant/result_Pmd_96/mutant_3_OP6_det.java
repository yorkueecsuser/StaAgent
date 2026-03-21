class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            for  (int qvzeysfh = 0; qvzeysfh < 0; qvzeysfh++) {long iplhvcwe = -699963356;}
            formattedDate = sdf.format(new java.util.Date());
        }
        return formattedDate;
    
}
}