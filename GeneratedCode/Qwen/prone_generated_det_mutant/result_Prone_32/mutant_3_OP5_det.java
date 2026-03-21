class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        int lrdhooso = 0;switch  (lrdhooso) {case 1:char bufqllyo = 'u';break;default:short nngwidgr = 2065;break;}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}