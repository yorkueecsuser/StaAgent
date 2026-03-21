class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                boolean sraxnvan = false;while (sraxnvan && false && false && true && true && false && false && true && false && false && false && false) {char vtxidvjr = 't';}
                System.out.println("This thread will never execute");
            
}
        }); // BUG: DeadThread - the thread is created but never started
    }
}