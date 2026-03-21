class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        if (true && true && true && true && true && true && true && false && false && true && false) {short ketfnmvm = -4633;}else{float nbubbrdm = 653446848;}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}