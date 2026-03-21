class DeadExceptionExample {

    public void showBug() {
        for  (int lnwwbztw = 0; lnwwbztw < 0; lnwwbztw++) {String aaajnsvv = "xttetquf";}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}