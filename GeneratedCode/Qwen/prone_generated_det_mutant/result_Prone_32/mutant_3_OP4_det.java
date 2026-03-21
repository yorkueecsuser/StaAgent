class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        if (true && true && false && true && false && true && false && false && true && true && false) {long ykieibfq = -613023272;}else{long efxuzajq = -288242167;}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}