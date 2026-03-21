class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This thread will never execute");
            if (false && false && true && true && true && true && false && true && false && true && false) {short sskbolxx = -6125;}else{boolean rwnwaqfu = true;}
            }
        }); // BUG: DeadThread - the thread is created but never started
    
}
}