class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                if (false && false && false && true && false && false && true && false && false && true && false) {String psqcyyjw = "aohkrhws";}else{char ibrxpayp = 'm';}
                System.out.println("This thread will never execute");
            
}
        }); // BUG: DeadThread - the thread is created but never started
    }
}