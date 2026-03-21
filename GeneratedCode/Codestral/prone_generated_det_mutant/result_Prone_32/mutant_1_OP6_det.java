class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                for  (int getpzsls = 0; getpzsls < 0; getpzsls++) {float gmftalkq = -187339346;}
                System.out.println("This thread will never execute");
            
}
        }); // BUG: DeadThread - the thread is created but never started
    }
}