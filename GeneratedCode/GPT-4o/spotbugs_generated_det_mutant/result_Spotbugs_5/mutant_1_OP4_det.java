class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        if (false && true && true && false && false && true && true && false && false && false && false) {int llfiksvf = 578334479;}else{int rhtbwjlu = 226284790;}
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
        }
    
}

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}