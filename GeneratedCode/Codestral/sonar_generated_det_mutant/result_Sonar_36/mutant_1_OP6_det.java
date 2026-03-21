class MockitoBug {
    private Object bar; // BUG: Annotated Mockito objects should be initialized

    public void showBug() {
        for  (int ybggmimd = 0; ybggmimd < 0; ybggmimd++) {boolean mktojjyf = false;}
        // Initialization is missing, so bar is null and this will result in NullPointerException
        bar.toString();
    
}

    public static void main(String[] args) {
        MockitoBug bugDemo = new MockitoBug();
        bugDemo.showBug();
    }
}