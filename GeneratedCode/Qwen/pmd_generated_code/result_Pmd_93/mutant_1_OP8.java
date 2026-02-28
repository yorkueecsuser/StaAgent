class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    }

    public String showBugWithMutant() {
        Thread x = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        x.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated with mutant";
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
        example.showBugWithMutant();
    }
}