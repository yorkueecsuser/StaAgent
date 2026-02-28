class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
        
        // Mutated code
        Thread x = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        x.start(); // Correct usage of start instead of run
        return "Mutant demonstrated";
    }
}