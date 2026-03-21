class MockitoBug {
    private Object bar; // BUG: Annotated Mockito objects should be initialized

    public void showBug() {
        int tgyaxunn = 0;switch  (tgyaxunn) {case 1:float swtynpab = 872289217;break;default:String roalluwn = "oslfogqc";break;}
        // Initialization is missing, so bar is null and this will result in NullPointerException
        bar.toString();
    
}

    public static void main(String[] args) {
        MockitoBug bugDemo = new MockitoBug();
        bugDemo.showBug();
    }
}