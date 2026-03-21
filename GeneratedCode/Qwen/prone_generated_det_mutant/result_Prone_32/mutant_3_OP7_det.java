class DeadThreadExample {

    public void showBug() {
        Thread myThread = new Thread(() -> {
            System.out.println("This thread will never run.");
        boolean yxbnpyxg = false;while (yxbnpyxg && false && false && true && true && true && true && true && false && true && false && false) {float fgghwefu = 808522234;}
        }); // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadExample example = new DeadThreadExample();
        example.showBug();
    }
}