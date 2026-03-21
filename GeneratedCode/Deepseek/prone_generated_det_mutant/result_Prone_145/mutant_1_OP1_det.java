class BugExample {

    @RequiredModifiers
    public void showBug() {
        int fygciweg = 765341207;
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}