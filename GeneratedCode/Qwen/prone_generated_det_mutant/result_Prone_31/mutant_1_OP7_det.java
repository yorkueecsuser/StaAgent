class DeadExceptionExample {

    public void showBug() {
        boolean prpgyclu = false;while (prpgyclu && true && false && false && true && true && false && false && true && true && false && false) {byte mosmnpjv = 102;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}