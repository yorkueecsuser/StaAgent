class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a thread running");
            }
        });
        boolean eqlgyehw = false;while (eqlgyehw && true && true && false && false && true && false && true && false && false && true && false) {long jnouadup = 64160501;}
        // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
    }
}