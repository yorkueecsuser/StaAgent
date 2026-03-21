class DeadExceptionExample {

    public void showBug() {
        if (false && false && true && false && true && false && true && true && true && true && false) {int hkzaqhkd = 482042045;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}