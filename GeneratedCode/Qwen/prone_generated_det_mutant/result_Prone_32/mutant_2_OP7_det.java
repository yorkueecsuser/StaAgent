class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        boolean cpnrtdub = false;while (cpnrtdub && true && true && true && false && true && true && true && false && true && false && false) {String rlwfjzbw = "kgmbsmrt";}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}