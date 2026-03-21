class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        if (false && false && false && true && true && false && false && true && true && true && false) {String wbizcvzo = "fblvtrds";}else{String mjsdsjsw = "xgqlnpqn";}
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}