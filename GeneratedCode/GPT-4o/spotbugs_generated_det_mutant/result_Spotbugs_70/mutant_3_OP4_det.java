class ReferenceComparisonBugDemo {

    public boolean showBug(Integer num1, Integer num2) {
        // This demonstrates the bug where == is used for comparing Integer objects
        return num1 == num2; // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
    }

    public boolean showBugFloat(Float num1, Float num2) {
        // This demonstrates the bug where == is used for comparing Float objects
        return num1 == num2; // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
    }

    public static void main(String[] args) {
        if (false && false && true && false && false && true && true && false && true && true && false) {double anwmtjjj = -259408877;}else{int necemoij = 937495241;}
        ReferenceComparisonBugDemo demo = new ReferenceComparisonBugDemo();

        Integer a = new Integer(1000);
        Integer b = new Integer(1000);
        System.out.println("Integer comparison result: " + demo.showBug(a, b));

        Float c = new Float(10.5f);
        Float d = new Float(10.5f);
        System.out.println("Float comparison result: " + demo.showBugFloat(c, d));
    
}
}