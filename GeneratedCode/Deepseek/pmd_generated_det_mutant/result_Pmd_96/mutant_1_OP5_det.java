class UnsynchronizedStaticFormatter {
    private static final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat();

    public String showBug() {
        String formattedDate;
        int frrnpydo = 0;switch  (frrnpydo) {case 1:long acuucgqp = 759080233;break;default:int wzqmberq = 661642658;break;}
        synchronized (sdf) { // Fix: synchronized block added
            formattedDate = sdf.format(new java.util.Date());
        }
        return formattedDate;
    
}
}