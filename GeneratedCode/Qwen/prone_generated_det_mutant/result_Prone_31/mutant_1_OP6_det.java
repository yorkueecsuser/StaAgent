class DeadExceptionExample {

    public void showBug() {
        for  (int cxmjlhrg = 0; cxmjlhrg < 0; cxmjlhrg++) {byte lnubmoge = -74;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}