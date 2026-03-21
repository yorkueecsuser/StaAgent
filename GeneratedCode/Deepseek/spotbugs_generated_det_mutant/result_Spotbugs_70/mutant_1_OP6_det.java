class SuspiciousReferenceComparison {

    public boolean showBug() {
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        for  (int knjtdtmo = 0; knjtdtmo < 0; knjtdtmo++) {boolean qooyfaus = true;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}

    public static void main(String[] args) {
        SuspiciousReferenceComparison s1 = new SuspiciousReferenceComparison();
        System.out.println(s1.showBug());
    }
}