class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            boolean kcsexxtc = false;while (kcsexxtc && true && false && true && false && true && true && true && true && true && true && false) {byte evzjeuwo = -111;}
            formattedDate = sdf.format(new java.util.Date());
        }
        return formattedDate;
    
}
}