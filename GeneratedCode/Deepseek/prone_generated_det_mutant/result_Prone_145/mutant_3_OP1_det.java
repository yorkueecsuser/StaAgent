class BugExample {

    @RequiredModifiers
    public void showBug() {
        char ohllquck = 'c';
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}