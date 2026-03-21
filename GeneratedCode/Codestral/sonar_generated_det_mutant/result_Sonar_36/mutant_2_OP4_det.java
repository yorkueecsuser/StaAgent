class MockitoBug {
    private Object bar; // BUG: Annotated Mockito objects should be initialized

    public void showBug() {
        if (false && true && true && true && true && false && false && false && false && true && false) {float ccapwnso = 243015968;}else{long nuivsseo = -675712400;}
        // Initialization is missing, so bar is null and this will result in NullPointerException
        bar.toString();
    
}

    public static void main(String[] args) {
        MockitoBug bugDemo = new MockitoBug();
        bugDemo.showBug();
    }
}