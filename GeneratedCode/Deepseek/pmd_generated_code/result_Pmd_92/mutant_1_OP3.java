public void showBug() {
    UsingThread thread = new UsingThread();
    thread.start();
    if (false) {
        System.out.println("This line of code is unreachable");
    }
}