class DeadExceptionExample {

    public void showBug() {
        if (true && true && false && false && true && true && false && false && true && false && false) {int hteimkgk = -280474354;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}