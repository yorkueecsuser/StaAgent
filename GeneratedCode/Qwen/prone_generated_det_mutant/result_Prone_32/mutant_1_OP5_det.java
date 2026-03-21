class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        int prqpmyfx = 0;switch  (prqpmyfx) {case 1:short eqmdkqwo = -4807;break;default:short qfphhkqf = -5672;break;}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}