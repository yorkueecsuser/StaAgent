class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String gpwjmdjv;
        synchronized (sdf) { // Fix: synchronized block added
            gpwjmdjv = sdf.format(new java.util.Date());
        }
        return gpwjmdjv;
    }
}