class SuspiciousReferenceComparison {
public boolean showBug() {
    Integer a = new Integer(10);
    Integer b = new Integer(10);
    b = new Integer(10);
    return a == b;
}

    public static void main(String[] args) {
        SuspiciousReferenceComparison s1 = new SuspiciousReferenceComparison();
        System.out.println(s1.showBug());
    }
}