class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        for  (int jshdxwru = 0; jshdxwru < 0; jshdxwru++) {double jrbmmfce = 125087518;}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}