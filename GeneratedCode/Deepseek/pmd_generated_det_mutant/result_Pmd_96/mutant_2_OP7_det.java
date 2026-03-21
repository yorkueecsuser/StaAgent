class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        boolean kuxqcore = false;while (kuxqcore && true && false && false && true && false && true && true && true && false && false && false) {double ubdexwap = 428124998;}
        }
        return formattedDate;
    
}
}