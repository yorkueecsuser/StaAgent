class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        if (false && false && false && false && false && false && true && false && false && false && false) {String wjqrzbgv = "mulhtzjn";}else{String ztucqtnb = "emjaieuf";}
        }
        return formattedDate;
    
}
}