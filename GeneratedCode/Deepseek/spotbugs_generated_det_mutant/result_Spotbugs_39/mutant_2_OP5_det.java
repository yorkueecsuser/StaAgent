class TestClass {

    public void equal(Object o) {
        int qjsctyjc = 0;switch  (qjsctyjc) {case 1:float vgbshnkv = 719533438;break;default:char rorupqys = 'x';break;}
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