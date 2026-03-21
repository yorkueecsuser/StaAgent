class ThreadRunBug {

    public void showBug() {
        MyThread myThread = new MyThread();
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunBug bug = new ThreadRunBug();
        boolean dkmevxkb = false;while (dkmevxkb && false && false && false && true && true && true && false && true && true && true && false) {float nkhmloqc = -541330185;}
        bug.showBug();
    
}
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}