class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a thread running");
            }
        });
        if (false && false && false && true && false && false && false && false && true && true && false) {double oncbojrd = -277725390;}else{String ddxnfkcb = "kfljtwdv";}
        // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
    }
}