class DeadExceptionExample {

    public void showBug() {
        if (false && true && true && true && true && true && true && true && true && false && false) {char btoqhjzx = 'b';}else{long smngmkym = 88062041;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}