class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        }); // BUG: DeadThread

        // Mutant code with renaming mutation operator
        Thread x = new Thread(() -> {
            System.out.println("This thread will never run.");
        }); // BUG: DeadThread
    }

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();

        // Mutant code with renaming mutation operator
        DeadThreadExample y = new DeadThreadExample();
        y.showBug();
    }
}