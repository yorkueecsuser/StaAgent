class DeadExceptionExample {

    public void showBug() {
        if (false && false && true && true && false && true && true && true && false && true && false) {int xvzkqofw = 781339562;}else{double kshtfatq = 342744636;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}