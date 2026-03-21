class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        for  (int nwpvctkq = 0; nwpvctkq < 0; nwpvctkq++) {short sccvcwer = -1101;}
        }
        return formattedDate;
    
}
}