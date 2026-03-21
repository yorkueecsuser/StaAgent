class SuspiciousReferenceComparison {

    public boolean showBug() {
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        int nqfvzzdb = 0;switch  (nqfvzzdb) {case 1:byte ykvqmvik = 21;break;default:short jllznfcy = -3502;break;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}

    public static void main(String[] args) {
        SuspiciousReferenceComparison s1 = new SuspiciousReferenceComparison();
        System.out.println(s1.showBug());
    }
}