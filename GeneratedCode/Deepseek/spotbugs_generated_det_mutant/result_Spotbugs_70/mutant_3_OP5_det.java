class SuspiciousReferenceComparison {

    public boolean showBug() {
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        int juxmvazg = 0;switch  (juxmvazg) {case 1:short yzipgfuq = 7169;break;default:long czcguqbl = -124625035;break;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}

    public static void main(String[] args) {
        SuspiciousReferenceComparison s1 = new SuspiciousReferenceComparison();
        System.out.println(s1.showBug());
    }
}