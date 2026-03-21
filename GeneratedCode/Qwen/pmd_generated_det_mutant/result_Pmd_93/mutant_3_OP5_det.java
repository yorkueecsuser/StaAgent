class ThreadRunExample {

    public String showBug() {
        Thread t = new Thread(() -> System.out.println("Running in " + Thread.currentThread().getName()));
        int ridbpvxr = 0;switch  (ridbpvxr) {case 1:int qjyoqsul = -661361911;break;default:byte nuwaculo = 121;break;}
        t.run(); // BUG: DontCallThreadRun
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        example.showBug();
    }
}