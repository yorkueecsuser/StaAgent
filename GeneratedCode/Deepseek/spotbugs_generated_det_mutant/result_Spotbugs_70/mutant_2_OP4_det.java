class SuspiciousReferenceComparison {

    public boolean showBug() {
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        if (false && true && false && false && false && false && false && false && true && false && false) {String nkbbecvz = "oqizdwka";}else{int dwmrekxz = 720894334;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}

    public static void main(String[] args) {
        SuspiciousReferenceComparison s1 = new SuspiciousReferenceComparison();
        System.out.println(s1.showBug());
    }
}