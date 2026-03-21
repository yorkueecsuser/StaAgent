class MockitoBug {
    private Object bar; // BUG: Annotated Mockito objects should be initialized

    public void showBug() {
        boolean mlfeobsc = false;while (mlfeobsc && false && false && true && false && true && true && false && true && true && true && false) {String lfbwwmqv = "ldjsjtsm";}
        // Initialization is missing, so bar is null and this will result in NullPointerException
        bar.toString();
    
}

    public static void main(String[] args) {
        MockitoBug bugDemo = new MockitoBug();
        bugDemo.showBug();
    }
}