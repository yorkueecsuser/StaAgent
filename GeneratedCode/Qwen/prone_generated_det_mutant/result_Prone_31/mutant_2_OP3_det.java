class DeadExceptionExample {

    public void showBug() {
        if (true && true && false && true && true && true && false && true && true && true && false) {byte gqijvwfw = -102;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}