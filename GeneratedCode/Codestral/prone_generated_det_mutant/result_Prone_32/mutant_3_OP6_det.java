class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                for  (int bmfqlcvh = 0; bmfqlcvh < 0; bmfqlcvh++) {byte jqzrzksv = -107;}
                System.out.println("This thread will never execute");
            
}
        }); // BUG: DeadThread - the thread is created but never started
    }
}