class ThreadInterruptionExample {
public boolean showBug() {
    Thread newThread = new Thread(()-> { Thread.currentThread().interrupt(); });
    newThread = new Thread(()-> { Thread.currentThread().interrupt(); });
    newThread.start();
    return Thread.currentThread().interrupted();
}

    public static void main(String[] args) {
        ThreadInterruptionExample example = new ThreadInterruptionExample();
        System.out.println("Is current thread interrupted: " + example.showBug());
    }
}