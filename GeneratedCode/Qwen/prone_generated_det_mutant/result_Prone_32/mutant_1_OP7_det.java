class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        boolean llnpuwhi = false;while (llnpuwhi && true && true && true && true && false && false && true && true && true && true && false) {byte drwjfxao = -56;}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}