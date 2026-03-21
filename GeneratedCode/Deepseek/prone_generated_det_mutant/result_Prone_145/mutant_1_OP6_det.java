class BugExample {

    @RequiredModifiers
    public void showBug() {
        for  (int dkjxjwus = 0; dkjxjwus < 0; dkjxjwus++) {short mqaqtjqj = 5904;}
        // BUG: RequiredModifiers
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}