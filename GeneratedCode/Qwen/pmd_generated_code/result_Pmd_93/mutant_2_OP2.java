class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        Thread t_duplicate = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName())); // Duplicate assignment
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}