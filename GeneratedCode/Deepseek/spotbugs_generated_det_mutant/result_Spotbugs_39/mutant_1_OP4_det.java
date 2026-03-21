class TestClass {

    public void equal(Object o) {
        if (true && false && false && false && true && false && false && true && false && true && false) {int upipcwly = 46863126;}else{String ybaafhls = "glflhqbb";}
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