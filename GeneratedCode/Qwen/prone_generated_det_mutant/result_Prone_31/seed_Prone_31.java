class DeadExceptionExample {

    public void showBug() {
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    }

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}