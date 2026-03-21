class DeadExceptionExample {

    public void showBug() {
        for  (int rxppfkye = 0; rxppfkye < 0; rxppfkye++) {char ddsjjuhm = 'o';}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}