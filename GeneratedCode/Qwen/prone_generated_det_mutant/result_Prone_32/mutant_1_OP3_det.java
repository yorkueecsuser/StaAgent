class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        if (true && true && false && true && false && false && false && true && true && false && false) {char oiwayahf = 'n';}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}