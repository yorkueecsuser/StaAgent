class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        int lzvkwqrd = 0;switch  (lzvkwqrd) {case 1:short eesowafz = 1256;break;default:float cfimhwxi = -470379159;break;}
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}