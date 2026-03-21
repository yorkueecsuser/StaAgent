class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        if (false && true && true && false && true && true && true && true && true && false && false) {char teayxotj = 'n';}
        }
        return formattedDate;
    
}
}