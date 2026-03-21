class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        boolean pymiibrz = false;while (pymiibrz && true && true && false && true && true && true && true && true && false && false && false) {long uhsusyqa = 884268292;}
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}