class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a thread running");
            }
        });
        for  (int cptmqqtx = 0; cptmqqtx < 0; cptmqqtx++) {float xaooqone = 570979621;}
        // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
    }
}