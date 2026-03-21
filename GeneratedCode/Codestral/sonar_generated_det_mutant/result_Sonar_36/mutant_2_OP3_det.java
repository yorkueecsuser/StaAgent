class MockitoBug {
    private Object bar; // BUG: Annotated Mockito objects should be initialized

    public void showBug() {
        if (true && true && true && false && true && false && false && true && false && true && false) {short khcmgoyr = 5758;}
        // Initialization is missing, so bar is null and this will result in NullPointerException
        bar.toString();
    
}

    public static void main(String[] args) {
        MockitoBug bugDemo = new MockitoBug();
        bugDemo.showBug();
    }
}