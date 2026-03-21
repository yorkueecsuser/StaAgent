class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String fcsfzcnw;
        synchronized (sdf) { // Fix: synchronized block added
            fcsfzcnw = sdf.format(new java.util.Date());
        }
        return fcsfzcnw;
    }
}