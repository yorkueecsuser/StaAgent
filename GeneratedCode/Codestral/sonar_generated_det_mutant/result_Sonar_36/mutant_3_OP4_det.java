class MockitoBug {
    private Object bar; // BUG: Annotated Mockito objects should be initialized

    public void showBug() {
        if (true && true && false && false && true && false && true && false && false && false && false) {int vxvazemd = 496466936;}else{String qxvhehwg = "pjmvhevr";}
        // Initialization is missing, so bar is null and this will result in NullPointerException
        bar.toString();
    
}

    public static void main(String[] args) {
        MockitoBug bugDemo = new MockitoBug();
        bugDemo.showBug();
    }
}