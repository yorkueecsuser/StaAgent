class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        if (false && true && false && true && true && false && false && true && true && false && false) {float opisxnby = 97321395;}else{float clkgrevr = 106813999;}
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        }
        return formattedDate;
    
}
}