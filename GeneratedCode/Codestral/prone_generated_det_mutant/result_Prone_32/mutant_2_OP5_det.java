class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int rwtnzmfv = 0;switch  (rwtnzmfv) {case 1:int pmjyncel = -617771442;break;default:byte otxacrww = -45;break;}
                System.out.println("This thread will never execute");
            
}
        }); // BUG: DeadThread - the thread is created but never started
    }
}