class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        boolean yfclmofn = false;while (yfclmofn && true && false && false && true && true && true && true && false && true && true && false) {double vygkdtni = -369236354;}
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