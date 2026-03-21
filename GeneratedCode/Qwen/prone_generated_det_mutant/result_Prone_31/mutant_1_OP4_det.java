class DeadExceptionExample {

    public void showBug() {
        if (true && true && false && false && true && true && false && false && true && true && false) {long pkpvusib = 516388534;}else{double yrrghphc = 383486413;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}