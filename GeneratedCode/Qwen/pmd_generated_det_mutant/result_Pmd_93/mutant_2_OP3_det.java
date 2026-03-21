class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        if (false && false && true && true && true && false && false && true && true && false && false) {float zzwxtezq = -846953030;}
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}