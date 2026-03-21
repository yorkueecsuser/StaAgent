class TestClass {

    public void equal(Object o) {
        if (false && false && false && true && false && false && false && false && true && false && false) {double jowdtogo = -599724630;}else{short lkqudvos = -7116;}
        // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    
}

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.showBug();
    }

    public void showBug() {
        equal(new Object());
    }
}