class DeadThreadExample {
public void showBug() {
    Thread myThread = new Thread(()-> { System.out.println("This thread will never run."); });
    myThread = new Thread(()-> { System.out.println("This thread will never run."); });
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}