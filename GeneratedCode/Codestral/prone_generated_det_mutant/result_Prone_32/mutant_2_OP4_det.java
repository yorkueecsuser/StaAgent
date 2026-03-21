class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                if (true && false && false && true && true && false && false && false && false && true && false) {float jkkcfelt = 662783717;}else{short nwoubjcw = -246;}
                System.out.println("This thread will never execute");
            
}
        }); // BUG: DeadThread - the thread is created but never started
    }
}