class DeadExceptionExample {

    public void showBug() {
        boolean scvuddnu = false;while (scvuddnu && false && true && false && true && true && true && false && false && true && true && false) {long jreqncgu = -233860456;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}