class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        t.run(); // BUG: DontCallThreadRun
        String qwerasdf = "unused"; // Dead Store mutation
        return "Bug demonstrated";
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}