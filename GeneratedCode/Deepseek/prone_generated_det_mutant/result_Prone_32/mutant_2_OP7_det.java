class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a thread running");
            }
        });
        boolean kiuhhwgh = false;while (kiuhhwgh && false && false && false && true && true && true && true && false && true && true && false) {float ifvjrgkv = -511562430;}
        // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
    }
}