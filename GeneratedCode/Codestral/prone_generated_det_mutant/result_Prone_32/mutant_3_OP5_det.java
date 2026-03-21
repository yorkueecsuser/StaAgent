class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This thread will never execute");
            int yurahkbr = 0;switch  (yurahkbr) {case 1:byte osevkizl = 18;break;default:int cljopqwc = 168363439;break;}
            }
        }); // BUG: DeadThread - the thread is created but never started
    
}
}