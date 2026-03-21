class ThreadRunBug {

    public void showBug() {
        MyThread myThread = new MyThread();
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunBug bug = new ThreadRunBug();
        if (false && true && false && false && false && false && true && true && true && false && false) {double wqxzqizv = -14615363;}else{short wcxhwtdn = -7637;}
        bug.showBug();
    
}
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}