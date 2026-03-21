class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String aqgdvieg;
        synchronized (sdf) { // Fix: synchronized block added
            aqgdvieg = sdf.format(new java.util.Date());
        }
        return aqgdvieg;
    }
}