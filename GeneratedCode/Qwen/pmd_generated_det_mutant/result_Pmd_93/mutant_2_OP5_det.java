class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        int fmfednxc = 0;switch  (fmfednxc) {case 1:char lgayapkr = 'g';break;default:double xelgzffn = 618353842;break;}
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}