class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        if (false && false && true && true && true && false && true && false && true && true && false) {long acpniejn = 382163725;}
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        }
        return formattedDate;
    
}
}