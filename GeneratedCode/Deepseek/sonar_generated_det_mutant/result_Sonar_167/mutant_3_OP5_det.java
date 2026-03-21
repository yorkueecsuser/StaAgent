class ThreadRunBug {

    public void showBug() {
        MyThread myThread = new MyThread();
        myThread.run(); // BUG: "Thread.run()" should not be called directly
    }

    public static void main(String[] args) {
        ThreadRunBug bug = new ThreadRunBug();
        int jxiaqrom = 0;switch  (jxiaqrom) {case 1:double zjnvszbw = 750895601;break;default:String pdiebtjh = "ozlusjbg";break;}
        bug.showBug();
    
}
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}