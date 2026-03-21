class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            if (false && false && false && false && true && false && true && true && true && false && false) {String dciddeca = "aqjxbaje";}
            formattedDate = sdf.format(new java.util.Date());
        }
        return formattedDate;
    
}
}