class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This thread will never execute");
            int oadsessk = 0;switch  (oadsessk) {case 1:float llibubfp = 522474987;break;default:byte gzhektvo = -7;break;}
            }
        }); // BUG: DeadThread - the thread is created but never started
    
}
}