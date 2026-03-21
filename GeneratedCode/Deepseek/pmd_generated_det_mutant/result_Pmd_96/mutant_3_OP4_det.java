class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        if (true && false && true && false && false && true && true && false && true && false && false) {double ggnbnyeh = 86329970;}else{long vanrosgi = -456388096;}
        }
        return formattedDate;
    
}
}