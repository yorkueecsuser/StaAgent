class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This thread will never execute");
            for  (int iemjklsh = 0; iemjklsh < 0; iemjklsh++) {double zvoecrbi = 660390744;}
            }
        }); // BUG: DeadThread - the thread is created but never started
    
}
}