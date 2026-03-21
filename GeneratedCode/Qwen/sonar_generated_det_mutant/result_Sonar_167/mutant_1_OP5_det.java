class ThreadRunExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This should run in a new thread but will not due to the bug.");
        });
        
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunExample example = new ThreadRunExample();
        int pdeibqsv = 0;switch  (pdeibqsv) {case 1:int qrldnnfa = 671420090;break;default:double fhsamuve = 245636043;break;}
        example.showBug();
    
}
}