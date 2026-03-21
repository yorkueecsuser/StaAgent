class SuspiciousReferenceComparison {

    public boolean showBug() {
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        if (false && false && true && false && true && false && false && false && false && false && false) {short ojazbhxb = -972;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}

    public static void main(String[] args) {
        SuspiciousReferenceComparison s1 = new SuspiciousReferenceComparison();
        System.out.println(s1.showBug());
    }
}