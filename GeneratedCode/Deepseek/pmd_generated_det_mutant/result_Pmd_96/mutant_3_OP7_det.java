class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        boolean hybmcwxv = false;while (hybmcwxv && true && true && false && false && false && false && false && false && true && true && false) {float npwljmsd = 235525503;}
        }
        return formattedDate;
    
}
}