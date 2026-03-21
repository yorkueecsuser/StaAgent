class DeadThreadExample {
public String showBug() {
    Thread thread = new Thread(new Runnable() { @ Override public void run() { System.out.println("Thread is running"); } });
    thread = new Thread(new Runnable() { @ Override public void run() { System.out.println("Thread is running"); } });
    return "Thread created but not started";
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        System.out.println(example.showBug());
    }
}