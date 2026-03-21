class DeadExceptionExample {

    public void showBug() {
        boolean uazcralt = false;while (uazcralt && true && true && true && false && true && false && true && true && true && true && false) {int eldcusmg = -223320708;}
        new IllegalArgumentException("This is a dead exception"); // BUG: DeadException
    
}

    public static void main(String[] args) {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug();
    }
}